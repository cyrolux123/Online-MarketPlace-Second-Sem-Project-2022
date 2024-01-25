import java.util.ArrayList;  
import java.util.Scanner;

public class Market {
    static ArrayList<String> PName = new ArrayList<String>();
    static ArrayList<String> PCode = new ArrayList<String>();
    static ArrayList<Double> Price = new ArrayList<Double>();
    static ArrayList<Integer> Quantity = new ArrayList<Integer>();
    static ArrayList<Double> Total_Price = new ArrayList<Double>();
    static double totalbill = 0.0;
    static Scanner ip = new Scanner(System.in);
    static Market obj = new Market();

    void start() {
        totalbill = 0.0; // Initialize totalbill
        System.out.println("*****************************************************************************************");
        System.out.println("!!!------------------------------Welcome to More Market-------------------------------!!!");
        System.out.println("*****************************************************************************************");
        System.out.println(" If you want see our list of items please type 1");
        int sc = ip.nextInt();
        if (sc == 1) {
            meth1();
        } else {
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println(" You entered value is not there , choose correct option !!!");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println();
            start();
        }
    }

    double bill(double totalbill) {
        double dis = 0.0;
        if (totalbill >= 1000) {
            dis = 0.05 * totalbill;
        }
        return dis;
    }

    void com_method(double total, String PN, String PC, double P, int Q) {
        System.out.println(" press 1 for continue shopping");
        System.out.println(" press 2 for stop here and get bill");
        System.out.println(" Press 3 for Exit");
        int press = ip.nextInt();
        if (press == 1) {
            totalbill = totalbill + total;
            callall(PN, PC, P, Q, total);
            meth1();
        } else if (press == 2) {
            totalbill = totalbill + total;
            callall(PN, PC, P, Q, total);
            System.out.print(" Enter your Name: ");
            ip.nextLine();
            String name = ip.nextLine();
            System.out.print(" Enter your Address: ");
            String add = ip.nextLine();
            String ph = "";
            int i = 1;
            while (i == 1) {
                System.out.print(" Enter your Contact No: ");
                String phone = ip.next();
                if (phone.length() == 10) {
                    ph = ph + phone;
                    i = 0;
                } else {
                    System.out.println(" Please check and enter valid number");
                    i = 1;
                }
                System.out.println();
            }
            meth4(name, add, ph);
        } else if (press == 3) {
            System.out.println();
            meth3(5);
        } else {
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println(" You entered value is not there,  choose correct option !!!");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println();
            com_method(total, PN, PC, P, Q);
        }
    }

    void meth1() {
        System.out.println();
        System.out.println(" 1) Fruits");
        System.out.println(" 2) Vegetables");
        System.out.println(" 3) Cosmetics");
        System.out.println(" 4) Masala Powders");
        System.out.println(" 5) Exit");
        System.out.println("*****************************************************************************************");
        System.out.println(" Please choose your option: ");
        int option = ip.nextInt();
        meth2(option);
    }

    void meth2(int option) {
        if (option <= 5) {
            System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
            int yes = ip.nextInt();
            if (yes == 1) {
                meth3(option);
            } else if (yes == 2) {
                meth1();
            } else {
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println(" You entered value is not there , choose correct option either 1 or 2 !!!");
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println();
                meth2(option);
            }
        } else {
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println(" You entered value is not there , choose correct option !!!");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println();
            meth1();
        }
    }

    void meth3(int option)
	{
		switch(option)
		{
		case 1:
			System.out.println();
			System.out.println(" 101  Mango----->1kg------->RS.205");
			System.out.println(" 102  Apple----->1kg------->RS.250");
			System.out.println(" 103  Greps----->1kg------->RS.116");
			System.out.println(" 104  Guva------>1kg------->RS.99");
			System.out.println("*****************************************************************************************");
			System.out.println(" Please choose your product code: ");
			int fcode=ip.nextInt();
			if(fcode==101)
			{
				obj.Mango(option);
			}
			else if(fcode==102)
			{
				obj.Apple(option);
			}
			else if(fcode==103)
			{
				obj.Greps(option);
			}
			else if(fcode==104)
			{
				obj.Guva(option);
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth3(option);
			}
			break;
		case 2:
			System.out.println();
			System.out.println(" 201  Tomato----------->1kg------->RS.30");
			System.out.println(" 202  Green Chilli----->1kg------->RS.25");
			System.out.println(" 203  Potato----------->1kg------->RS.49");
			System.out.println(" 204  Cucumber--------->1kg------->RS.35");
			System.out.println("*****************************************************************************************");
			System.out.println(" Please choose your product code: ");
			int vcode=ip.nextInt();
			if(vcode==201)
			{
				obj.Tomato(option);
			}
			else if(vcode==202)
			{
				obj.Green_Chilli(option);
				
			}
			else if(vcode==203)
			{
				obj.Potato(option);
			}
			else if(vcode==204)
			{
				obj.Cucumber(option);
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth3(option);
			}
			break;
		case 3:
			System.out.println();
			System.out.println(" 301  Kajal----------->1------->RS.10");
			System.out.println(" 302  Lip Stick------->1------->RS.20");
			System.out.println(" 303  Nail Polish----->1------->RS.50");
			System.out.println(" 304  Face Powder----->1------->RS.120");
			System.out.println("*****************************************************************************************");
			System.out.println(" Please choose your product code: ");
			int Ccode=ip.nextInt();
			if(Ccode==301)
			{
				obj.Kajal(option);
			}
			else if(Ccode==302)
			{
				obj.Lip_Stick(option);
				
			}
			else if(Ccode==303)
			{
				obj.Nail_Poslish(option);
			}
			else if(Ccode==304)
			{
				obj.Face_Powder(option);
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth3(option);
			}
			break;
		case 4:
			System.out.println();
			System.out.println(" 401  Chilli Powder--------->1------->RS.69");
			System.out.println(" 402  Turmeric Powder------->1------->RS.85");
			System.out.println(" 403  Coriander Powder------>1------->RS.90");
			System.out.println(" 404  Pepper Powder--------->1------->RS.110");
			System.out.println("*****************************************************************************************");
			System.out.println(" Please choose your product code: ");
			int Mcode=ip.nextInt();
			if(Mcode==401)
			{
				obj.Chilli_Powder(option);
			}
			else if(Mcode==402)
			{
				obj.Turmeric_Powder(option);
				
			}
			else if(Mcode==403)
			{
				obj.Coriander_Powder(option);
			}
			else if(Mcode==404)
			{
				obj.Pepper_Powder(option);
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth3(option);
			}
			break;
		case 5:
			totalbill=0.0;
			System.out.println();
			System.out.println(" Successfully Exited");
			System.out.println("#########################################################################################");
			System.out.println();
			System.out.println();
			obj.start();
		}
	}
	void Mango(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
        System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Mango           ";
		String PC="101";
		double P=200;
		if(s==1)
		{
			System.out.println(" Mango ===> How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*205;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there ,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Mango(option);
		}
	}
	void Apple(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Apple           ";
		String PC="102";
		double P=250;
		if(s==1)
		{
			System.out.println(" Apple ===> How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*250;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there , choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Apple(option);
		}
	}
	void Greps(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Greps           ";
		String PC="103";
		double P=100;
		if(s==1)
		{
			System.out.println(" Greps ===> How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*116;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there , choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Greps(option);
		}
	}
	void Guva(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Guva            ";
		String PC="104";
		double P=90;
		if(s==1)
		{
			System.out.println(" Guva ===> How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*99;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Guva(option);
		}
	}
	void Tomato(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Tomato          ";
		String PC="201";
		double P=30;
		if(s==1)
		{
			System.out.println(" Tomato ===> How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*30;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Tomato(option);
		}
	}
	void Green_Chilli(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Green Chilli    ";
		String PC="202";
		double P=25;
		if(s==1)
		{
			System.out.println(" Green Chilli ===> How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*25;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Green_Chilli(option);
		}
	}
	void Potato(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Potato          ";
		String PC="203";
		double P=49;
		if(s==1)
		{
			System.out.println(" Potato ===> How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*49;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Potato(option);
		}
	}
	void Cucumber(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Cucumber        ";
		String PC="204";
		double P=35;
		if(s==1)
		{
			System.out.println(" Cucumber ===> How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*35;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Cucumber(option);
		}
	}
	void Kajal(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Kajal           ";
		String PC="301";
		double P=10;
		if(s==1)
		{
			System.out.println(" Kajal ===> How many do yo need?");
			int Q=ip.nextInt();
			double total=Q*10;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Kajal(option);
		}
	}
	void Lip_Stick(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Lip Stic        ";
		String PC="302";
		double P=20;
		if(s==1)
		{
			System.out.println(" Lip_Stick ===> How many do yo need?");
			int Q=ip.nextInt();
			double total=Q*20;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Lip_Stick(option);
		}
	}
	void Nail_Poslish(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Nail Polish     ";
		String PC="303";
		double P=50;
		if(s==1)
		{
			System.out.println(" Nail_Polish ===> How many do yo need?");
			int Q=ip.nextInt();
			double total=Q*50;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Nail_Poslish(option);
		}
	}
	void Face_Powder(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Face Powder     ";
		String PC="304";
		double P=120;
		if(s==1)
		{
			System.out.println(" Face_Powder ===> How many do yo need?");
			int Q=ip.nextInt();
			double total=Q*120;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Face_Powder(option);
		}
	}
	void Chilli_Powder(int option)
	{
		System.out.println("Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Chilli Powder   ";
		String PC="401";
		double P=69;
		if(s==1)
		{
			System.out.println(" Chiili Powder ===> How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*69;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Chilli_Powder(option);
		}
	}
	void Turmeric_Powder(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Turmeric Powder ";
		String PC="402";
		double P=85;
		if(s==1)
		{
			System.out.println(" Turmeric_Powder ===> How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*85;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Turmeric_Powder(option);
		}
	}
	void Coriander_Powder(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Coriander Powder";
		String PC="403";
		double P=90;
		if(s==1)
		{
			System.out.println(" Coriander_Powder ===> How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*90;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Coriander_Powder(option);
		}
	}
	void Pepper_Powder(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Pepper Powder   ";
		String PC="404";
		double P=110;
		if(s==1)
		{
			System.out.println(" Pepper_Powder ===> How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*110;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Pepper_Powder(option);
		}
	}
	void meth4(String name,String add,String phone)
	{
		System.out.println("*****************************************************************************************");
		System.out.println("!!!------------------------------Welcome to More Market-------------------------------!!!");
		System.out.println("*****************************************************************************************");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(" S.No	 Product Name    	   Product Code       Quantity	    Price     Total Price");
		System.out.println(" ====	 =============    	   ============       ========      ======    ===========");
		for(int i=0;i<PName.size();i++)
		{
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("  "+(i+1)+"   	  "+PName.get(i)+"              "+PCode.get(i)+"		 "+Quantity.get(i)+"	     "+Price.get(i)+"    	  "+Total_Price.get(i));
			System.out.println("-----------------------------------------------------------------------------------------");
		}
		System.out.println();
		System.out.println(" Total bill of purchased items:  "+totalbill);
		double discount=obj.bill(totalbill);
		if(discount>0.0)
			System.out.println(" Hey "+name+" congtrats !!! you received a discount of 5%: "+discount);
		System.out.println(" Sorry "+name+" you are not received any discount...");
		System.out.println(" Your final final bill: "+(totalbill-discount));
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<---Thank you for shopping--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("*****************************************************************************************");
		System.out.println("Customer details:");
		System.out.println("----------------");
		System.out.println(" Name: "+name);
		System.out.println(" Address: "+add);
		System.out.println(" Phone: "+phone);
		System.out.println();
		System.out.println("*****************************************************************************************");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("<<<<<-------------------**** IF YOU WANT TO DO SHOPPING AGAIN ****---------------->>>>>>>");
		System.out.println("-----------------------------------------------------------------------------------------");
		obj.meth5();
	}
	void meth5()
	{
		System.out.println("If yes press 1 or else press 2");
		int press=ip.nextInt();
		if(press==1)
			obj.meth1();
		else if(press==2)
		{	
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("#########################################################################################");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("<<<<<<<<<<,,,,,,,,,,,,,,,,,,,,Once again THANK YOU for Shopping,,,,,,,,,,,,,,,,,>>>>>>>>>");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("#########################################################################################");
			System.out.println();
			System.out.println();
			System.out.println();
		}	
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.meth5();
		}
		ip.close();
	}
	void callall(String PN,String PC,double P,int Q,double total)
	{
		PName.add(PN);
		PCode.add(PC);
		Price.add(P);
		Quantity.add(Q);
		Total_Price.add(total);
	}
    public static void main(String[] args) {
        obj.start();
        ip.close(); // Close Scanner at the end
    }
}
