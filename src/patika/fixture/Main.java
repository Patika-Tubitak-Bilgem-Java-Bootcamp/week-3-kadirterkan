package patika.fixture;

import java.util.*;

public class Main {

    private final static Scanner input = new Scanner(System.in);
    private final static SplittableRandom random = new SplittableRandom();

    public static void main(String[] args) {
        List<String> teamListEven = returnEven();
        int teamCountEven = teamListEven.size();

        if (teamCountEven % 2 != 0) {
            teamListEven.add("Bay");
            teamCountEven++;
        }

        LinkedHashSet<Match<String, String>> evenList = shuffleThis(teamListEven, teamCountEven);

        int weekCountEven = 2 * (teamCountEven - 1);

        printList(evenList, weekCountEven, teamCountEven);

        List<String> teamListOdd = returnOdd();
        int teamCountOdd = teamListOdd.size();

        if (teamCountOdd % 2 != 0) {
            teamListOdd.add("Bay");
            teamCountOdd++;
        }

        System.out.println();
        System.out.println("***************************");
        System.out.println("***************************");
        System.out.println("***************************");
        System.out.println("2. Sezon");
        LinkedHashSet<Match<String, String>> oddList = shuffleThis(teamListOdd, teamCountOdd);

        int weekCountOdd = 2 * (teamCountOdd - 1);

        printList(oddList, weekCountOdd, teamCountOdd);


    }

    public static LinkedHashSet<Match<String, String>> shuffleThis(List<String> teamList, int teamCount) {
        LinkedHashSet<Match<String, String>> matches = new LinkedHashSet<>();

        Integer totalMatchCount = (teamCount) * (teamCount - 1);

        while (matches.size() < totalMatchCount) {
            List<String> copy = new ArrayList<>(teamList);
            while (!copy.isEmpty()) {
                Collections.shuffle(copy);
                String team1 = copy.get(0);
                String team2 = copy.get(1);

                Match match = new Match(team1, team2);
                matches.add(match);
                copy.remove(team1);
                copy.remove(team2);
            }
        }

        return matches;
    }

    public static List<String> returnEven() {
        List<String> teamList = new ArrayList<>();
        teamList.add("Galatasaray");
        teamList.add("Bursaspor");
        teamList.add("Fenerbahçe");
        teamList.add("Beşiktaş");
        teamList.add("Başakşehir");
        teamList.add("Trabzonspor");

        return teamList;
    }

    public static List<String> returnOdd() {
        List<String> teamList = new ArrayList<>();
        teamList.add("Galatasaray");
        teamList.add("Bursaspor");
        teamList.add("Fenerbahçe");
        teamList.add("Beşiktaş");
        teamList.add("Başakşehir");
        teamList.add("Bursaspor");
        teamList.add("Boluspor");

        return teamList;
    }

    public static void printList(LinkedHashSet<Match<String, String>> matches, int weekCount, int teamCount) {
        System.out.println("Week 1");
        int count = 1;
        for (Match match : matches) {
            System.out.println(match.getValue1() + " vs " + match.getValue2());

            int week = (2 * count + teamCount) / teamCount;

            if (week <= weekCount) {
                if (count % (teamCount / 2) == 0) {
                    System.out.println();
                    System.out.println("Week " + week);
                }
            }

            count++;
        }
    }
}