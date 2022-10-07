package io.checknft.api.pojo.events;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class EventsListPojo {
    public int total;
    public String next;
    public ArrayList<Content> content;

    @Getter
    @Setter
    @ToString
    public static class Collection {
        public int id;
        public String name;
        public String description;
        public String logo;
        public String termsAndConditionsURL;
        public String slug;
    }

    @Getter
    @Setter
    @ToString
    public static class Content {
        public int id;
        public String type;
        public String date;
        public String externalId;
        public String transaction;
        public String saleProtocol;
        public String tokenId;
        public Stats stats;
        public TokenSender tokenSender;
        public TokenSeller tokenSeller;
        public TokenReceiver tokenReceiver;
        public TokenBuyer tokenBuyer;
        public Contract contract;
        public Collection collection;
    }

    @Getter
    @Setter
    @ToString
    public static class Contract {
        public String address;
        public String token;
        public String network;
    }

    @Getter
    @Setter
    @ToString
    public static class Stats {
        public String amount;
        public String currency;
        public Double priceUSD;
        public Double priceETH;
        public Integer ownerFee;
        public Integer protocolFee;
        public Double statRarityScore;
    }

    @Getter
    @Setter
    @ToString
    public static class TokenBuyer {
        public String address;
        public String name;
    }

    @Getter
    @Setter
    @ToString
    public static class TokenReceiver {
        public String address;
        public String name;
    }

    @Getter
    @Setter
    @ToString
    public static class TokenSeller {
        public String address;
        public String name;
    }

    @Getter
    @Setter
    @ToString
    public static class TokenSender {
        public String address;
        public String name;
    }
}
