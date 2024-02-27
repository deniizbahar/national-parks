import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Area written in hectares
        MilliPark[] arr = new MilliPark[48];
        arr[0] = new MilliPark("Abant Gölü Milli Parkı", "Bolu", 2022, 1262);
        arr[1] = new MilliPark("Ağrı Dağı Millî Parkı", "Ağrı", 2004, 88015);
        arr[2] = new MilliPark("Aladağlar Millî Parkı", "Adana", 1995, 55064);
        arr[3] = new MilliPark("Altınbeşik Mağarası Millî Parkı", "Antalya", 1994, 1147);
        arr[4] = new MilliPark("Altındere Vadisi Millî Parkı", "Trabzon", 1987, 4468);
        arr[5] = new MilliPark("Başkomutan Tarihî Millî Parkı", "Afyon", 1981, 34834);
        arr[6] = new MilliPark("Beydağları Sahil Millî Parkı", "Antalya", 1972, 31166);
        arr[7] = new MilliPark("Beyşehir Gölü Millî Parkı", "Konya", 1993, 86855);
        arr[8] = new MilliPark("Boğazköy-Alacahöyük Millî Parkı", "Çorum", 1988, 2600);
        arr[9] = new MilliPark("Botan Vadisi Millî Parkı", "Siirt", 2019, 11834);
        arr[10] = new MilliPark("Derebucak Çamlık Mağaraları Millî Parkı", "Konya", 2022, 1147);
        arr[11] = new MilliPark("Dilek Yarımadası-Büyük Menderes Deltası Millî Parkı", "Aydın", 1966, 27598);
        arr[12] = new MilliPark("Gala Gölü Millî Parkı", "Edirne", 2005, 6087);
        arr[13] = new MilliPark("Güllük Dağı Millî Parkı", "Antalya", 1970, 6700);
        arr[14] = new MilliPark("Hakkâri Cilo ve Sat Dağları Millî Parkı", "Hakkari", 2020, 27500);
        arr[15] = new MilliPark("Hatila Vadisi Millî Parkı", "Artvin", 1994, 16944);
        arr[16] = new MilliPark("Honaz Dağı Millî Parkı", "Denizli", 1995, 9429);
        arr[17] = new MilliPark("Ilgaz Dağı Millî Parkı", "Çankırı", 1976, 1128);
        arr[18] = new MilliPark("İğneada Longoz Ormanları Millî Parkı", "Kırlareli", 2007, 3155);
        arr[19] = new MilliPark("İstiklâl Yolu Tarihî Millî Parkı", "Ankara", 2018, 235);
        arr[20] = new MilliPark("Kaçkar Dağları Millî Parkı", "Artvin", 1994, 52970);
        arr[21] = new MilliPark("Karagöl-Sahara Millî Parkı", "Artvin", 1994, 3251);
        arr[22] = new MilliPark("Karatepe-Aslantaş Millî Parkı", "Osmaniye", 1958, 4143);
        arr[23] = new MilliPark("Kazdağı Millî Parkı", "Balıkesir", 1994, 20935);
        arr[24] = new MilliPark("Kızıldağ Milli Parkı", "Isparta", 1969, 55106);
        arr[25] = new MilliPark("Kop Dağı Müdafaası Tarihî Millî Parkı", "Bayburt", 2016, 6335);
        arr[26] = new MilliPark("Kovada Gölü Millî Parkı", "Isparta", 1970, 6551);
        arr[27] = new MilliPark("Köprülü Kanyon Millî Parkı", "Antalya", 1973, 35719);
        arr[28] = new MilliPark("Kuşcenneti Millî Parkı", "Balıkesir", 1959, 17058);
        arr[29] = new MilliPark("Küre Dağları Millî Parkı", "Bartın", 2000, 37753);
        arr[30] = new MilliPark("Malazgirt Meydan Muharebesi Tarihî Millî Parkı", "Muş", 2018, 238);
        arr[31] = new MilliPark("Marmaris Millî Parkı", "Muğla", 1996, 29206);
        arr[32] = new MilliPark("Munzur Vadisi Millî Parkı", "Tunceli", 1971, 42674);
        arr[33] = new MilliPark("Nemrut Dağı Millî Parkı", "Adıyaman", 1988, 13827);
        arr[34] = new MilliPark("Nene Hatun Tarihî Millî Parkı", "Erzurum", 2009, 387);
        arr[35] = new MilliPark("Sakarya Meydan Muharebesi Tarihî Millî Parkı", "Ankara", 2015, 13850);
        arr[36] = new MilliPark("Saklıkent Milli Parkı", "Antalya", 1996, 1643);
        arr[37] = new MilliPark("Sarıçalı Dağı Millî Parkı", "Ankara", 2021, 1024);
        arr[38] = new MilliPark("Sarıkamış-Allahuekber Dağları Millî Parkı", "Erzurum", 2004, 22520);
        arr[39] = new MilliPark("Soğuksu Millî Parkı", "Ankara", 1959, 1186);
        arr[40] = new MilliPark("Spil Dağı Millî Parkı", "İzmir", 1968, 6801);
        arr[41] = new MilliPark("Sultansazlığı Millî Parkı", "Kayseri", 2006, 24538);
        arr[42] = new MilliPark("Tek Tek Dağları Millî Parkı", "Şanlıurfa", 2007, 19335);
        arr[43] = new MilliPark("Troya Tarihî Millî Parkı", "Çanakkale", 1996, 13517);
        arr[44] = new MilliPark("Uludağ Millî Parkı", "Bursa", 1961, 13024);
        arr[45] = new MilliPark("Yedigöller Millî Parkı", "Bolu", 1965, 1623);
        arr[46] = new MilliPark("Yozgat Çamlığı Millî Parkı", "Yozgat", 1958, 517);
        arr[47] = new MilliPark("Yumurtalık Lagünü Millî Parkı", "Adana", 2008, 16980);
        List<MilliPark> list0=new ArrayList<>();
        List<MilliPark> list1 = new ArrayList<>();
        List<MilliPark> list2 = new ArrayList<>();
        Object[] genericArray = new Object[2];
        genericArray[0] = list1.toArray();
        genericArray[1] = list2.toArray();
        for (MilliPark milliPark : arr) {
            if (milliPark.getArea() < 15000) {
                list1.add(milliPark);
            } else {
                list2.add(milliPark);
            }
        }
        for (int i=0;i<arr.length;i++){
            list0.add(arr[i]);

        }
        System.out.println("National Parks in List 1");
        for (MilliPark milliPark : list1) {
            System.out.println(milliPark.getNationalparkName() + " " + milliPark.getCityName() + " " + milliPark.getYear() + " " + milliPark.getArea());
        }
        System.out.println("National Parks in List 2");
        for (MilliPark milliPark : list2) {
            System.out.println(milliPark.getNationalparkName() + " " + milliPark.getCityName() + " " + milliPark.getYear() + " " + milliPark.getArea());
        }
        int a = 0;
        int b = 0;
        for (MilliPark milliPark : list1) {
            a += milliPark.getArea();
        }
        System.out.println("Total Area in List 2 " + a);
        for (MilliPark milliPark : list2) {
            b += milliPark.getArea();
        }
        System.out.println("Total Area in List 1 " + b);

        StackX stackX=new StackX(list1.size());
        StackX stackX1=new StackX(list2.size());
        for (MilliPark milliPark : list1) {
           stackX.push(milliPark);
        }
        System.out.println("List 1 with stack");
        while (!stackX.isEmpty()) {
            MilliPark tempStack0 = stackX.pop();
            System.out.println(tempStack0.getNationalparkName() + " " + tempStack0.getCityName() + " " + tempStack0.getYear() + " " + tempStack0.getArea());
        }
        for (MilliPark milliPark : list2) {
            stackX1.push(milliPark);
        }
        System.out.println("List 2 with stack");
        while (!stackX1.isEmpty()) {
            MilliPark tempStack0 = stackX1.pop();
            System.out.println(tempStack0.getNationalparkName() + " " + tempStack0.getCityName() + " " + tempStack0.getYear() + " " + tempStack0.getArea());
        }

       Queue queue=new Queue(list1.size());
        for (int i = 0; i < list1.size(); i++) {
            queue.Insert(list1.get(i));
        }
        System.out.println("List 1 With Queue ");
        for (int i = 0; i < list1.size(); i++) {
            MilliPark tempqueue = queue.Remove();
            System.out.println(tempqueue.getNationalparkName() + " " + tempqueue.getCityName() + " " + tempqueue.getYear() + " " + tempqueue.getArea());
        }
        Queue queue1=new Queue(list2.size());
        for (int i = 0; i < list2.size(); i++) {
            queue1.Insert(list2.get(i));
        }
        System.out.println("List 2 With Queue ");
        for (int i = 0; i < list2.size(); i++) {
            MilliPark tempqueue1 = queue1.Remove();
            System.out.println(tempqueue1.getNationalparkName() + " " + tempqueue1.getCityName() + " " + tempqueue1.getYear() + " " + tempqueue1.getArea());
        }
        PriorityQ priorityqueue=new PriorityQ();
        for (int i =0;i<list0.size();i++){
            priorityqueue.add(list0.get(i));
        }
        System.out.println("National Parks With Pq");
        for (int i =0;i<list0.size();i++){
            MilliPark temp=priorityqueue.Remove();
            System.out.println(temp.getNationalparkName() + " " + temp.getCityName() + " " + temp.getYear() + " " + temp.getArea());
        }



    }

    static class StackX {
        private int maxSize;
        private MilliPark[] stackArray;
        private int top;


        public StackX(int s)
        {
            maxSize = s; // set array size
            stackArray = new MilliPark[maxSize];
            top = -1;
        }


        public void push(MilliPark j)
        {
            stackArray[++top] = j;
        }



        public MilliPark pop()
        {
            return stackArray[top--];
        }


        public MilliPark peek()
        {
            return stackArray[top];
        }


        public boolean isEmpty()
        {
            return (top == -1);
        }


        public boolean isFull()
        {
            return (top == maxSize - 1);
        }
    }
    static class Queue
    {
        private int maxSize;
        private MilliPark[] queArray;
        private int front;
        private int rear;
        private int nItems;

        public Queue(int s)
        {
            maxSize = s;
            queArray = new MilliPark[maxSize];
            front = 0;
            rear = -1;
            nItems = 0;
        }

        public void Insert(MilliPark j)
        {
            if (rear == maxSize - 1)
                rear = -1;
            queArray[++rear] = j;
            nItems++;
        }

        public MilliPark Remove()
        {
            MilliPark temp = queArray[front++];
            if (front == maxSize)
                front = 0;
            nItems--;
            return temp;
        }

        public MilliPark PeekFront()
        {
            return queArray[front];
        }

        public boolean IsEmpty()
        {
            return (nItems == 0);
        }

        public boolean IsFull()
        {
            return (nItems == maxSize);
        }

        public int Size()
        {
            return nItems;
        }

    }
    static class PriorityQ
    {

        private int maxSize;
        private List<MilliPark> queueList;
        private int nItems;

        public PriorityQ() {
           queueList=new ArrayList<>();
            nItems=0;
        }

        public void add(MilliPark item)
        {
            queueList.add(item);
            nItems++;
        }

        public MilliPark Remove()
        {
            MilliPark tempMax = queueList.get(0);
            for (MilliPark milliPark : queueList)
            {
                if (milliPark.getArea()<tempMax.getArea())
                {
                    tempMax = milliPark;
                }
            }
            queueList.remove(tempMax);
            nItems--;

            return tempMax;
        }


        public boolean IsEmpty()
        { return (nItems == 0); }

    }
}