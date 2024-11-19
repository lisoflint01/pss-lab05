package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder andreaRossi = new AccountHolder("Andrea", "Rossi", 1);

        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder alexBianchi = new AccountHolder("Alex", "Bianchi", 2);

        // 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
        BankAccount rossiBankAccount = new SimpleBankAccount(andreaRossi.getUserID(), 0);
        BankAccount bianchiBankAccount = new StrictBankAccount(alexBianchi.getUserID(), 0);
        
        // 5) Depositare €10000 in entrambi i conti
        rossiBankAccount.deposit(andreaRossi.getUserID(), 10000);
        bianchiBankAccount.deposit(alexBianchi.getUserID(), 10000);
        
        // 6) Prelevare €15000 da entrambi i conti
        rossiBankAccount.withdraw(andreaRossi.getUserID(), 15000);
        bianchiBankAccount.withdraw(alexBianchi.getUserID(), 15000);
        
        // 7) Stampare in stdout l'ammontare corrente
        System.out.println("amount Rossi" + rossiBankAccount.getBalance());
        System.out.println("amount Binachi" + bianchiBankAccount.getBalance());
        

        // 9) Depositare nuovamente €10000 in entrambi i conti
        rossiBankAccount.deposit(andreaRossi.getUserID(), 10000);
        bianchiBankAccount.deposit(alexBianchi.getUserID(), 10000);
        
        // 10) Invocare il metodo computeManagementFees su entrambi i conti
        rossiBankAccount.chargeManagementFees(1);
        bianchiBankAccount.chargeManagementFees(1);
        
        // 11) Stampare a video l'ammontare corrente
        System.out.println("amount Rossi" + rossiBankAccount.getBalance());
        System.out.println("amount Binachi" + bianchiBankAccount.getBalance());
        
    }
}
