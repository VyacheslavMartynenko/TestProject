package advert;

public abstract class Advert {
    protected AdvertMaker advertMaker;

    public Advert(AdvertMaker advertMaker) {
        this.advertMaker = advertMaker;
    }

    public abstract void giveAdvert();
}
