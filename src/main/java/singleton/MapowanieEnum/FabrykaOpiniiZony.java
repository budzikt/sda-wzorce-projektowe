package singleton.MapowanieEnum;

public class FabrykaOpiniiZony {
    FabrykaOpiniiZony(){

    }

    public String getOpinia(Koszula k, Spodnie s) {
        Mapper m = new Mapper(k, s);
        switch (m.getStan()) {
            case LADNIE: {
                return "Ladnie wygladasz";
            }
            case NIELADNIA: {
                return "Idz sie przebrac";
            }
            case OK: {
                return "Jest tak sobie, ale mamy malo czasu";
            }
            default: {
                return null;
            }
        }
    }
}
