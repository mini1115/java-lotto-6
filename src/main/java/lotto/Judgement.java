package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Judgement {
    public Set<Integer> commonNumber(List<Integer> winNumber, List<Integer> randomNumber) {
        Set<Integer> commonNumber = winNumber.stream().filter(randomNumber::contains).collect(Collectors.toSet());
        return commonNumber;
    }

    public int getResultIndex(int commonNumber, boolean bonus) {
        return MatchCount.getMatchIndex(commonNumber, bonus);
    }

    public static void earingRate(List<Integer> result, int inputMoney) {
        List<Integer> mount = Arrays.asList(2000000000, 30000000, 1500000, 50000, 5000);
        double totalMoney = 0;
        for (int i = 0; i < mount.size(); i++) {
            totalMoney += result.get(i) * mount.get(i);
        }
        totalMoney = totalMoney / (inputMoney * 10);
        System.out.print("총 수익률은 " + totalMoney + "%입니다.");
    }

    public void statics(List<Integer> result) {
        System.out.println("당첨 통계\n" +
                "---\n3개 일치 (5,000원) - " + result.get(4) + "개\n" +
                "4개 일치 (50,000원) - " + result.get(3) + "개\n" +
                "5개 일치 (1,500,000원) - " + result.get(2) + "개\n" +
                "5개 일치, 보너스 볼 일치 (30,000,000원) - " + result.get(1) + "개\n" +
                "6개 일치 (2,000,000,000원) - " + result.get(0) + "개");
    }
}
