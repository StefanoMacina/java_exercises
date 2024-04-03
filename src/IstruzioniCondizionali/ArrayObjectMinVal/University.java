package IstruzioniCondizionali.ArrayObjectMinVal;

public class University {
    private Docente[] docenti;
    public University(Docente[] docenti) {
        this.docenti = docenti;
    }
    public int minAge(){
        int min = docenti[0].getAge();
        for(Docente dc : docenti){
            if(dc.getAge() < min){
                min = dc.getAge();
            }
        }
        return min;
    }

    public String[] trovaGiovani(){
        String[] risultato;
        int count = 0;
        for(var dc : docenti)
            if(dc.getAge() == minAge()) count++;
        risultato = new String[count];
        for(int i=0;i<docenti.length;i++){
            if(docenti[i].getAge() == minAge())
                risultato[i] = docenti[i].getCognome();
        }
        return risultato;
    }
}