package io.checknft.api.pojo.tokenPojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class TokensListByContractAddressAndTokenId {
    public int id;
    public String externalId;
    public String name;
    public String description;
    public String isEditableMetadata;
    public String url;
    public String previewURL;
    public String animationURL;
    public String metaURL;
    public String externalURL;
    public String fileType;
    public String mintedAt;
    public String lastEventDate;
    public Stats stats;
    public Owner owner;
    public Contract contract;
    public Collection collection;
    public ArrayList<Attribute> attributes;

    @Getter
    @Setter
    @ToString
    public static class Attribute {
        public String traitType;
        public String value;
    }

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
    public static class Contract {
        public String address;
        public String token;
        public String storage;
        public String network;
        public String totalSupply;
        public String totalSupplyEdition;
    }

    @Getter
    @Setter
    @ToString
    public static class Owner {
        public String address;
        public String name;
    }

    @Getter
    @Setter
    @ToString
    public static class Stats {
        public Double dailyPriceGrowth;
        public Double weeklyPriceGrowth;
        public Double monthlyPriceGrowth;
        public Double totalPriceGrowth;
        public Double statRarityScore;
        public Double avgUSDPrice;
        public Double avgETHPrice;
        public Double maxUSDPrice;
        public Double maxETHPrice;
        public Double minUSDPrice;
        public Double minETHPrice;
        public Double firstUSDPrice;
        public Double firstETHPrice;
        public Double lastUSDPrice;
        public Double lastETHPrice;
    }
}
