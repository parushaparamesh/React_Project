package collections;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Current_bill {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.Enter USC Number:-");
		Scanner sc=new Scanner(System.in);
		int usc=sc.nextInt();
		System.out.println(" 2.Enter Present Reading:-");
		int pres=sc.nextInt();
		int units=pres-100;
		
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println("         TSSPDCL");
		System.out.println("     Electricity Bill");
		System.out.println("        CUM NOTICE   ");
		System.out.println(" __________________________________");
		System.out.println(" BILL NO:004  DT:"+date);
		System.out.println(" TIME:"+time);
		System.out.println(" NAME:A C GUARDS" +" "+"GRP:M");
		System.out.println(" __________________________________");
		System.out.println(" USCNO:"+usc+"  "+"AREA:50010");
		System.out.println(" NAME:C.PARAMESH");
		System.out.println(" ADDR:M/S SKANDA ESTATES");
		System.out.println(" H.NO:3-6-568/5/N/6");
		System.out.println(" UDANDAPUR, GADWAL");
		System.out.println(" CAT:2   SC:0  PH:5");
		System.out.println(" LOAD:150.75  MF:1000");
		System.out.println(" __________________________________");
		System.out.println("  READING   MONTH  STATUS  ");
		System.out.println(" PRES:"+pres+ "   10/23"+"   01");
		System.out.println(" PREV:"+100 + "   11/23"+"   01");
		System.out.println(" UNITS:"+units+ "     AVG:150");
		System.out.println(" ___________________________________");
		System.out.println(" ENERGY CHARGES  :   56321.00  ");
		System.out.println(" CUST CHARGES    :   20.00");
		System.out.println(" ED              :   34.00");
		System.out.println(" ED INTREST      :   221.25");
		System.out.println(" ADDL CHARGES    :   6.00");
		System.out.println(" INT.ON.ACD      :   635.00");
		System.out.println();
		System.out.println(" BILL AMOUNT     :   5693.00");
		System.out.println(" ADJ  AMOUNT     :   0.231");
		System.out.println(" LOSS/GAIN       :   0.54");
		System.out.println(" NET AMOUNT      :   5689.36");
		System.out.println(" ARES UPTO 10/23 :   8972.69");
		System.out.println(" ARES FROM 11/23 :   365.0");
		System.out.println(" TOTAL AMOUNT    :\"TOTALAMOUNTDUE:-350\"");
		System.out.println(" ACD DUE    :");
		System.out.println(" AGL SERVICES DUES");
		System.out.println(" 1.10046537        :   256.00 ");
		System.out.println(" 2.10065633        :   152.03 ");
		System.out.println(" 3.10055352        :   95.450 ");
		System.out.println(" _____________________________________");
		
		if(units<500)
		{
		if(units<=100)
		{
		   int b=units*2;
		  
		}
		else if(units>100&&units<=200) {
			 double c=units*2.25;
//			  System.out.println("Units Used"+"    "+units +"units");
//			  System.out.println("Power Cost is"+" "+c);
//			  System.out.println("Total Bill is"+" "+c);
				System.out.println(" TOTAL AMOUNT DUE:"+c);
		}
		else if(units>200&&units<=400) {
			 double d=units*4.50;
//			  System.out.println("Units Used"+"    "+units +"units");
//			  System.out.println("Power Cost is"+" "+d);
//			  System.out.println("Total Bill is"+" "+d);
				System.out.println(" TOTAL AMOUNT DUE:"+d);
		}
		else if(units>400&&units<=500) {
			 double vd=units*6;
//			  System.out.println("Units Used"+"    "+units+"units");
//			  System.out.println("Power Cost is"+" "+vd);
//			  System.out.println("Total Bill is"+" "+vd);
				System.out.println(" TOTAL AMOUNT DUE:"+vd);
		}
		
	}
		else if(units>500)
		{
			if(units<=100)
			{
			  int bb=units*1;
//			  System.out.println("Units Consumed"+"    "+units +"units");
//			  System.out.println("Power Cost is"+" "+bb);
//			  System.out.println("Total Bill is"+" "+bb);
				System.out.println(" TOTAL AMOUNT DUE:"+ bb);
			}
			else if(units>100&&units<=400) {
				 double ccc=units*4.50;
//				  System.out.println("Units Used"+"    "+units +"units");
//				  System.out.println("Power Cost is"+" "+ccc);
//				  System.out.println("Total Bill is"+" "+ccc);
					System.out.println(" TOTAL AMOUNT DUE:"+ccc);
			}
			else if(units>400&&units<=500) {
				 double dd=units*6;
//				  System.out.println("Units Used"+"    "+units +"units");
//				  System.out.println("Power Cost is"+" "+dd);
//				  System.out.println("Total Bill is"+" "+dd);
					System.out.println(" TOTAL AMOUNT DUE:"+dd);
			}
			else if(units>500&&units<=600) {
				 double ds=units*8;
//				  System.out.println("Units Used"+"    "+units +"units");
//				  System.out.println("Power Cost is"+" "+ds);
//				  System.out.println("Total Bill is"+" "+ds);
					System.out.println(" TOTAL AMOUNT DUE:"+ds);
			}
			else if(units>600&&units<=800) {
				 double dvs=units*9;
//				  System.out.println("Units Used"+"    "+units+"units");
//				  System.out.println("Power Cost is"+" "+ds);
//				  System.out.println("Total Bill is"+" "+ds);
					System.out.println(" TOTAL AMOUNT DUE:"+dvs);
			}
			else if(units>800&&units<1000) {
				 double des=units*10;
//				  System.out.println("Units Used"+"    "+units+"units");
//				  System.out.println("Power Cost is"+" "+ds);
//				  System.out.println("Total Bill is"+" "+ds);
					System.out.println(" TOTAL AMOUNT DUE:"+des);
			}
			else if(units<=1000) {
				 double dsp=units*11;
//				  System.out.println("Units Used"+"    "+units +"units");
//				  System.out.println("Power Cost is"+" "+ds);
//				  System.out.println("Total Bill is"+" "+ds);
					System.out.println(" TOTAL AMOUNT DUE:"+dsp);
			}
			
			
			
		}
		
		
		
		
		
		
	}

}
