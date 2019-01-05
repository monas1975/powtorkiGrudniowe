package pl.dom.ZadaniaPodstawy.Enum;

public enum TypRoweru {
    ROWER,
    TANDEM;


   public  int pobierzIloscMiejsc() {
       int liczbaMiejsc =0;
       if (this == ROWER) {
           liczbaMiejsc = 1;
       }
       if (this== TANDEM) {
           liczbaMiejsc = 2;
       }

     return liczbaMiejsc;
   }


}


