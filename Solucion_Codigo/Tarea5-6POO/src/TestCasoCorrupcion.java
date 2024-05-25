public class TestCasoCorrupcion {
    public static void main(String[] args) {
        CasoCorrupcion[] casoCorrupcion = new CasoCorrupcion[3];

        //Los casos se dan de 3 tipos 1.=Iniciado , 2. Alerta , 3. Urgente
        casoCorrupcion[0] = new CasoCorrupcion("lojagama", 15, 5, 2023, 1, 4);
        casoCorrupcion[0].personasImpli[0] = new PersonasImplicada("Franco Quezada", 45, "Alcalde", 2, 3);
        casoCorrupcion[0].personasImpli[1] = new PersonasImplicada("Bailon", 61, "Ex Alcalde", 1, 0);
        casoCorrupcion[0].personasImpli[2] = new PersonasImplicada("Jaime Ramiro", 41, "Concejal de medio ambiente", 3, 0);
        casoCorrupcion[0].personasImpli[3] = new PersonasImplicada("Matias Agusto", 35, "Concejal de obras", 2, 5);

        Fiscalia fiscalia1 = new Fiscalia(1);
        fiscalia1.casoCorrupcion[0] = casoCorrupcion[0];
        fiscalia1.verificarEstado();

        casoCorrupcion[1] = new CasoCorrupcion("El padrino", 16, 3, 2024, 2, 3);
        casoCorrupcion[1].personasImpli[0] = new PersonasImplicada("xxxxxxx Lasso", 54, "Ex presidente", 1, 0);
        casoCorrupcion[1].personasImpli[1] = new PersonasImplicada("Camilo Agurto", 54, "Cuñado de Ex Presidente", 2, 6);
        casoCorrupcion[1].personasImpli[2] = new PersonasImplicada("Dimitri Varnegas", 54, "Jefe de Mafia", 2, 8);

        Fiscalia fiscalia2 = new Fiscalia(1);
        fiscalia2.casoCorrupcion[0] = casoCorrupcion[1];
        fiscalia2.verificarEstado();

        casoCorrupcion[2] = new CasoCorrupcion("The Bucaram's", 15, 5, 2024, 3, 2);
        casoCorrupcion[2].personasImpli[0] = new PersonasImplicada("Ex presidente Bucaram", 63, "Ex presidente", 2, 7);
        casoCorrupcion[2].personasImpli[1] = new PersonasImplicada("Leo Bucaram", 31, "Hijo de Ex presidente", 2, 4);

        Fiscalia fiscalia3 = new Fiscalia(1);
        fiscalia3.casoCorrupcion[0] = casoCorrupcion[2];
        fiscalia3.verificarEstado();

        for (CasoCorrupcion caso : casoCorrupcion) {
            System.out.println(caso);
        }
    }
}
