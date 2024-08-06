package com.test;

import java.util.*;

class Test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parse input
        int numSports = Integer.parseInt(scanner.nextLine().trim());
        List<List<Integer>> sportsParticipants = new ArrayList<>();
        for (int i = 0; i < numSports; i++) {
            String line = scanner.nextLine().trim();
            List<Integer> participants = new ArrayList<>();
            for (String s : line.split(",")) {
                participants.add(Integer.parseInt(s.trim()));
            }
            sportsParticipants.add(participants);
        }

        // Generate and print the schedule
        List<String> schedule = generateSchedule(sportsParticipants);
        for (String s : schedule) {
            System.out.println(s);
        }

        scanner.close();
    }

    private static List<String> generateSchedule(List<List<Integer>> sportsParticipants) {
        List<String> schedule = new ArrayList<>();
        Map<Integer, Integer> studentLastDayMap = new HashMap<>();

        int day = 1;
        boolean moreToSchedule;

        do {
            moreToSchedule = false;

            for (int i = 0; i < sportsParticipants.size(); i++) {
                List<Integer> participants = sportsParticipants.get(i);
                Collections.sort(participants);

                List<Integer> morningSession = new ArrayList<>();
                List<Integer> afternoonSession = new ArrayList<>();

                for (int rollNo : participants) {
                    if (!studentLastDayMap.containsKey(rollNo) || studentLastDayMap.get(rollNo) < day) {
                        if (!morningSession.contains(rollNo) && !afternoonSession.contains(rollNo)) {
                            morningSession.add(rollNo);
                            studentLastDayMap.put(rollNo, day);
                        }
                    } else if (!afternoonSession.contains(rollNo)) {
                        afternoonSession.add(rollNo);
                    }
                }

                if (!morningSession.isEmpty()) {
                    moreToSchedule = true;
                    schedule.add("Sport " + (i + 1) + " Day " + day + " FN");
                    schedule.add(getSessionLine(morningSession));
                }

                if (!afternoonSession.isEmpty()) {
                    moreToSchedule = true;
                    schedule.add("Sport " + (i + 1) + " Day " + day + " AN");
                    schedule.add(getSessionLine(afternoonSession));
                }
            }

            day++;
        } while (moreToSchedule);

        return schedule;
    }

    private static String getSessionLine(List<Integer> session) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < session.size(); i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(session.get(i));
        }
        return sb.toString();
    }
}
