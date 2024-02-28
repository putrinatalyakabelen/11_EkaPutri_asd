public class CanteenDemo11 {

        public static void main(String[] args) {
            Item11 items1 = new Item11("Nasi Goreng", 15000, 10);
            Item11 items2 = new Item11("Es Teh", 3000, 15);
            Item11 items3 = new Item11("Donat Gula", 3000, 20);
            Item11 items4 = new Item11("Es Jeruk", 4000, 15);
          
            Item11[] items = new Item11[5];
            items[0] = items1;
            items[1] = items2;
            items[2] = items3;
            items[3] = items4;
           
            System.out.println("DAFTAR KANTIN JTI ");
            for (int i = 0; i < items.length; i++) {
                items[i].displayInfo();
                System.out.println();
            }
            
        }
    }