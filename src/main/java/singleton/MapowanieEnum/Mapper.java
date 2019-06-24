package singleton.MapowanieEnum;

import javax.security.auth.login.Configuration;

public class Mapper {
    public enum Stan {LADNIE, NIELADNIA, OK};
    private Stan s;

    private static final int rozmiarEnumSpodnie = Spodnie.values().length;
    private static final int rozmiarEnumKoszula = Koszula.values().length;

    private static final Stan[][] map = {
                        /* Koszula */
                        /* Ladna            Nieladna        ok           */
     /*Spodnie*/
     /*Lande*/          {Stan.NIELADNIA,    Stan.LADNIE,    Stan.LADNIE},
     /*Nieladne*/       {Stan.LADNIE,       Stan.NIELADNIA, Stan.OK},
     /*Ok*/             {Stan.OK,           Stan.LADNIE,    Stan.LADNIE}
    };



    public Mapper(Koszula k, Spodnie s) {
        if(k == Koszula.LADNA && s == Spodnie.LADNE) {
            this.s = Stan.LADNIE;
        }
        else if(k == Koszula.NIELADNA && s == Spodnie.NIELADNE) {
            this.s = Stan.NIELADNIA;
        }
        else {
            this.s = Stan.OK;
        }
    }

    public Stan getStan() {
        return this.s;
    }

    public Stan getAdvancedSan(Koszula k, Spodnie s) {
        return Mapper.map[k.ordinal()][s.ordinal()];
    }

}
