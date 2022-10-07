package io.checknft.api.pojo.collections;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class CollectionPeriodStatisticPojo {
    public PeriodStats periodStats;

    @Getter
    @Setter
    @ToString
    public static class PeriodStats {
        public String period;
        public ArrayList<Integer> tokens;
        public Double avgUSDPrice;
        public Double avgETHPrice;
        public Integer minUSDPrice;
        public Integer minETHPrice;
        public Double maxUSDPrice;
        public Integer maxETHPrice;
        public Integer usdVolume;
        public Double ethVolume;
        public Double lastUSDPrice;
        public Double lastETHPrice;
        public Integer sales;
        public String startDate;
        public String endDate;
    }
}