public class StackImp<S>{

    private static final int capacidad = 5;
    private int lleno = 0;
    private String[] informacion;


    public StackImp() {
        informacion = new String[capacidad];
    }

    public int size() {
        return lleno + 1;
    }

    public void push(String palabra)
    {
        if (size() == capacidad) {
            System.out.print("Nada");}
         else{

        informacion[lleno] = palabra;
        lleno++;}
    }

    public String pop()
    {
        return informacion[lleno];
    }


    public boolean isEmpty()
    {
        return lleno < 1 ? true : false;
    }


}
