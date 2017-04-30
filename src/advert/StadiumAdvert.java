package advert;

public class StadiumAdvert extends Advert {

    public StadiumAdvert(AdvertMaker advertMaker) {
        super(advertMaker);
    }

    @Override
    public void giveAdvert() {
        advertMaker.createAdvert();
    }
}
