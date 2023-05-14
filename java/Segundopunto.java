class CompararCadenas{
    public static void main(String[] args){
        String cadena1 = "Los Amigos";
        String cadena2 = "los amigos";
        //se instancia objeto de tipo string
        Object objCadena = cadena1;
        //determinar si ambas cadenas son iguales

        System.out.println(cadena1.compareTo(cadena2));
        System.out.println(cadena1.compareToIgnoreCase(cadena2));
        System.out.println(cadena1.equals(cadena2));
        System.out.println(cadena1==cadena2);
    }
}