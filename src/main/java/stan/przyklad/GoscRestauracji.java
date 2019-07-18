package stan.przyklad;

public class GoscRestauracji extends Context{

    public GoscRestauracji() {
        super(new Glodny());
        this.stan.wykonajAkcje();
    }

    @Override
    public void jedz() {

        Stan s = this.getStan();
        if (s instanceof Glodny) {
            this.setStan(new Jedzacy());
        }
        if(s instanceof Jedzacy) {
            this.setStan(new Syty());
        }
        this.stan.wykonajAkcje();

    }
}
