package stan.przyklad;

public abstract class Context {

    Stan stan;

    public Context(Stan stan) {
        this.stan = stan;
    }

    public Stan getStan() {
        return this.stan;
    }

    public void setStan(Stan s) {
        this.stan = s;
    }

    public abstract void jedz();
}
