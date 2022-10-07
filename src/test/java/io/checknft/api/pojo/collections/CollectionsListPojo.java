package io.checknft.api.pojo.collections;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class CollectionsListPojo {
    public int total;
    public String next;
    public ArrayList<Content> content;

    @Getter
    @Setter
    @ToString
    public static class Content {
        public int id;
        public String name;
        public String description;
        public String logoURL;
        public String bannerURL;
        public String imageURL;
        public String featuredImageURL;
        public String largeImageURL;
        public String termsAndConditionsURL;
        public String externalSlug;
        public String externalId;
        public Social social;
        public Stats stats;
        public MarketPlace marketPlace;
        public Creator creator;
        public ArrayList<String> contracts;
    }

    @Getter
    @Setter
    @ToString
    public static class Creator {
        public String address;
        public String name;
    }

    @Getter
    @Setter
    @ToString
    public static class MarketPlace {
        public String apiURL;
        public String name;
        public String description;
    }

    @Getter
    @Setter
    @ToString
    public static class Social {
        public String discordURL;
        public String telegramURL;
        public String wikiURL;
    }

    @Getter
    @Setter
    @ToString
    public static class Stats {
        public int ownerFee;
        public int protocolFee;
        public String totalSupply;
        public double oneDayVolume;
        public double oneDayChange;
        public String oneDaySales;
        public double oneDayAveragePrice;
        public double sevenDayVolume;
        public double sevenDayChange;
        public String sevenDaySales;
        public double sevenDayAveragePrice;
        public double thirtyDayVolume;
        public double thirtyDayChange;
        public String thirtyDaySales;
        public double thirtyDayAveragePrice;
        public double totalVolume;
        public String totalSales;
        public String numOwners;
        public double averagePrice;
        public double marketCap;
        public double floorPrice;
    }
}