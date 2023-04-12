
import java.util.Scanner;

class Account {

    String name;
    String bankacc;
    double balance;
    boolean active;

    Account(String name, String bankacc, double balance) {
        this.name = name;
        this.bankacc = bankacc;
        this.balance = balance;
        this.active = true;
        System.out.println("Open account");
    }

    double checkBalance() {
        return balance;
    }

    void closeAccount() {
        active = false;
        printInfo();
    }

    boolean deposit(double money) {
        if (active == true) {
            balance += money;
            System.out.print(balance);
            return true;
        } else {
            return false;
        }
    }

    boolean withdrawn(double money) {
        if (balance - money >= 0) {
            balance -= money;
            System.out.print(balance);
            return true;
        } else {
            return false;
        }
    }

    void printInfo() {
        System.out.print(name + ", " + bankacc + ", " + balance + ", ");
        if (active == true) {
            System.out.println("active ");
        } else {
            System.out.println("inactive");
        }
    }
}

class Saving extends Account {

    String id = "";
    String tel = "";
    boolean promptPay;

    public Saving(String name, String bankacc, double balance) {
        super(name, bankacc, balance);
        System.out.println("Saving account");
        this.promptPay = false;
    }

    @Override
    void printInfo() {
        super.printInfo();
        if (promptPay == true) {
            System.out.print("PromptPay");
            if (id.length() != 0) {
                System.out.print(", " + id);
            }
            if (tel.length() != 0) {
                System.out.print(", " + tel);
            }
        } else {
            System.out.print("no PromptPay");
        }
        System.out.println("");
    }

    boolean openPromptPay(int cmd, String str) {
        if (cmd == 1) {
            if (str.length() == 13) {
                this.id = str;
                promptPay = true;
                return true;
            }
        } else if (cmd == 2) {
            if (str.length() == 10) {
                this.tel = str;
                promptPay = true;
                return true;
            }
        }

        return false;
    }

}

class FixedDeposit extends Account {

    double amount;

    FixedDeposit(String name, String bankacc, double balance, double amount) {
        super(name, bankacc, balance);
        this.amount = amount;
        System.out.println("FixedDeposit account with " + amount);
    }

    boolean deposit(double money) {
        if (money >= amount ) {
            if(super.active == false){
                return false ;
            }
            super.deposit(money);
//            System.out.println(amount);
            return true;
        } else {
            System.out.print("deposit less than " + amount+" ");
            return false;
        }
    }
}

class CurrentAccount extends Account {

    double over;

    CurrentAccount(String name, String bankacc, double balance, double over) {
        super(name, bankacc, balance);
        this.over = over;
        System.out.println("Current account with overdraft " + over);
    }

    boolean withdrawn(double money) {
        
        if (super.active == true && super.balance - money >= -(over)) {
            super.balance = super.balance - money;
            if (super.balance < 0){
                System.out.print(super.balance + " overdraft");
            } else {
                System.out.print(super.balance);
            }
            return true;
        } else {
            return false;
        }
    }

}

public class BankAccount1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Saving sAcc = null;
        FixedDeposit fAcc = null;
        CurrentAccount cAcc = null;
        for (int t = 1; t <= 3; t++) {
            String name = sc.nextLine();
            String code = sc.nextLine();
            double money1 = sc.nextDouble();
            if (t == 1) {
                sc.nextLine();
                sAcc = new Saving(name, code, money1);
            } else if (t == 2) {
                double money2 = sc.nextDouble();
                sc.nextLine();
                fAcc = new FixedDeposit(name, code, money1, money2);

            } else if (t == 3) {
                double money2 = sc.nextDouble();
                sc.nextLine();
                cAcc = new CurrentAccount(name, code, money1, money2);
            }
        }
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int type = sc.nextInt();
            double amount;
            boolean check;
            if (type == 1) {
                int cmd = sc.nextInt();
                if (cmd == 1) {
                    sAcc.printInfo();
                } else if (cmd == 2) {
                    System.out.println(sAcc.checkBalance());
                } else if (cmd == 3) {
                    sAcc.closeAccount();
                } else if (cmd == 4) {
                    amount = sc.nextDouble();
                    check = sAcc.deposit(amount);
                    if (check) {
                        System.out.print(" true");
                    } else {
                        System.out.print("false");
                    }
                } else if (cmd == 5) {
                    amount = sc.nextDouble();
                    check = sAcc.withdrawn(amount);
                    if (check) {
                        System.out.print(" true");
                    } else {
                        System.out.print("false");
                    }
                }
            }
            else if(type == 2){
                int cmd = sc.nextInt();
                if (cmd == 1) {
                    fAcc.printInfo();
                } else if (cmd == 2) {
                    System.out.println(fAcc.checkBalance());
                } else if (cmd == 3) {
                    fAcc.closeAccount();
                } else if (cmd == 4) {
                    amount = sc.nextDouble();
                    check = fAcc.deposit(amount);
                    if (check) {
                        System.out.println(" true");
                    } else {
                        System.out.println("false");
                    }
                } else if (cmd == 5) {
                    amount = sc.nextDouble();
                    check = fAcc.withdrawn(amount);
                    if (check) {
                        System.out.println(" true");
                    } else {
                        System.out.println("false");
                    }
                }
            }
            else if(type == 3){
                int cmd = sc.nextInt();
                if (cmd == 1) {
                    cAcc.printInfo();
                } else if (cmd == 2) {
                    System.out.println(cAcc.checkBalance());
                } else if (cmd == 3) {
                    cAcc.closeAccount();
                } else if (cmd == 4) {
                    amount = sc.nextDouble();
                    check = cAcc.deposit(amount);
                    if (check) {
                        System.out.println(" true");
                    } else {
                        System.out.println("false");
                    }
                } else if (cmd == 5) {
                    amount = sc.nextDouble();
                    check = cAcc.withdrawn(amount);
                    if (check) {
                        System.out.println(" true");
                    } else {
                        System.out.println("false");
                    }
                }
            }
        }
    }
}
