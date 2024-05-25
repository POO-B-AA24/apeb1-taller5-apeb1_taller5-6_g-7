import java.util.Scanner;

public class TestEmpresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre de la Empresa: ");
        String nombreEmpresa = sc.nextLine();
        
        System.out.print("Ingrese el ruc de la Empresa: ");
        int rucEmpresa = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Ingrese la dirreccion de la Empresa: ");
        String dirreccionEmp = sc.nextLine();
        
        System.out.print("Ingrese el numero de departamnetos de la Empresa: ");
        Departamento departamento[] = new Departamento[sc.nextInt()];
        sc.nextLine();
        
        for (int i = 0; i < departamento.length; i++) {
            System.out.print("Ingrese en el siguiente orden sin (,): nombre del departamento, numero de empleados, produccion anual: ");
            String[] datosDepartamento = sc.nextLine().split(" ");
            
            String nombreDep = datosDepartamento[0];
            int numEmpl = Integer.parseInt(datosDepartamento[1]);
            double prodAnual = Double.parseDouble(datosDepartamento[2]);
            
            departamento[i] = new Departamento(nombreDep, numEmpl, prodAnual);
        }
        Empresa empresa = new Empresa(nombreEmpresa, rucEmpresa, dirreccionEmp, departamento);
        
        
        System.out.println("Elija una opcion: ");
        System.out.println("1. Mostrar informacion de la Empresa: ");
        System.out.println("2. Mostrar informacion de todos los departamentos");
        System.out.println("3. Mostrar informacion de un departamento espesifico");
        int opc = sc.nextInt();
        
        empresa.determinarCategoria();
        switch(opc){
            case 1:
                System.out.println(empresa.toString());
                break;
            case 2:
                for (Departamento dep : departamento){
                    System.out.println(dep.toString());
                }
                break;
            case 3:
                System.out.print("Ingrese el numero de departamento: ");
                int dep = sc.nextInt();
                System.out.println(departamento[dep].toString());
        }
        
    }
}
