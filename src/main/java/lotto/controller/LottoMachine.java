package lotto.controller;

import lotto.domain.Lotto;
import lotto.domain.LottoValidate;
import lotto.domain.Lottos;

import java.util.List;
import java.util.Map;

public class LottoMachine {
    private static final int REFERENCE_PRICE = 1000;

    private final LottoValidate lottoValidate = new LottoValidate();

    public int run(int price) {
        return lottoValidate.priceValidation(price);
    }

    public List<Lotto> addLottos(int count) {
        return Lottos.addLotto(count).getLottos();
    }

    public void lotteryJackpot(Lotto lotto, List<Integer> correctNumbers) {
        lottoValidate.correctCheck(lotto, correctNumbers);
    }

    public Map<String, Object> lotteryRewards() {
        return lottoValidate.lotteryRewards();
    }
}