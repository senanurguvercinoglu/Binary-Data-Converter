package type_convertor;


import java.util.Scanner;



public class hexa_to_decimal {
	
	 
    // function to convert
    // Hexadecimal to Binary Number
    static String HexToBin(char hexdec[])
    {
    	
        int i=0;
        String hexTo="";
 
      
        for(i=0;i<hexdec.length;i++) {	
 
            switch (hexdec[i]) {
            case '0':
            	hexTo+="0000 ";
                break;
                
            case '1':
            	hexTo+="0001 ";
               break;
            case '2':
            	hexTo+="0010 ";
                break;
            case '3':
            	hexTo+="0011 ";
                break;
            case '4':
            	hexTo+="0100 ";
                break;
            case '5':
            	hexTo+="0101 ";
                break;
            case '6':
            	hexTo+="0110 ";
                break;
            case '7':
            	hexTo+="0111 ";
                break;
            case '8':
            	hexTo+="1000 ";
                break;
            case '9':
            	hexTo+="1001 ";
                break;
            case 'A':
            case 'a':
            	hexTo+="1010 ";
                break;
            case 'B':
            case 'b':
            	hexTo+="1011 ";
                break;
            case 'C':
            case 'c':
            	hexTo+="1100 ";
                break;
            case 'D':
            case 'd':
            	hexTo+="1101 ";
                break;
            case 'E':
            case 'e':
            	hexTo+="1110 ";
            	
                break;
            case 'F':
            case 'f':
            	hexTo+="1111 ";
            	break;
            default:
            	
            	hexTo+="\nInvalid hexadecimal digit " + hexdec[i];
            }
                
        }
      
    
        //binary represent of the given hexadecimal number
		return hexTo;
       
      
   }

    
public static void main(String args[])
    {
        // Get the Hexadecimal number

        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
      	System.out.println("\nEnter the number :");
		String s=scanner.nextLine();
		 if(s.length()%2!=0){
			 s=("0"+s);

           
         }
		 //if given number bigger than 4 byte than gives error
		 if(s.length()/2>4) {
			 System.out.println("Bigger than 4 bytes");

			 
		 }else {
			    
			    Scanner scann =new Scanner(System.in);
		        System.out.println("Data type:");
		        String datatype=scann.nextLine();
		        
		    	//if user want to convert to the sign datatype
		        if(datatype.equalsIgnoreCase("S")) {
		        	 
		    		char hexdec[]=new char[100];
		    		hexdec=s.toCharArray();
		    	     
		            try{
		            	
		               //take the binary value from the function
		               String str = HexToBin(hexdec);
		               int binary=0;
		            	 
						String[] arr = str.split(" "); 
		            	  
		                String bintodec="";
		                bintodec=""+arr[0].charAt(0)+arr[0].charAt(1)+arr[0].charAt(2)+arr[0].charAt(3)+arr[1].charAt(0)+arr[1].charAt(1)+arr[1].charAt(2)
 		                		+arr[1].charAt(3)+arr[2].charAt(0)+arr[2].charAt(1)+arr[2].charAt(2)+arr[2].charAt(3)+arr[3].charAt(0)+arr[3].charAt(1)+arr[3].charAt(2)+arr[3].charAt(3);
                		 
		                
                		 if(arr[0].startsWith("0")) {
                			 
                			 //if binary values sign is zero 
                			 binary=Integer.parseInt(bintodec,2);  
                			 //converting the binary value to the decimal value
				        	 int bin_to_decimal=Integer.parseInt(bintodec,2);
				        	  System.out.println(binary);
				      
		                }if(arr[0].startsWith("1")) {
               			 //if binary values sign is one  

	                		  binary=Integer.parseInt(bintodec,2);  
				        	 int bin_to_decimal=Integer.parseInt(bintodec,2);
				        	 System.out.println(binary);
		                }
		                
                		 
                		 

		        	
		            }
		            catch (ArrayIndexOutOfBoundsException e){
		            	System.out.print("");

		            }
		 			
				}
		        //if user want to converting float datatype
				else if(datatype.equalsIgnoreCase("F")) {
						char hexdec[]=new char[100];
						hexdec=s.toCharArray();
		    		
					
						String str = HexToBin(hexdec);
						    
		            	 
						String[] arr = str.split(" "); 
		            	    for(int i=0;i<arr.length;i++) {
		                	  int binary=0;
		                	  String fraction="";
		                	  double mantissa=0;

		                	  String exponent="";
		                	  
		                	  //find the sign of the binary value
		                	  String sign="";
		                	  sign=(""+arr[0].charAt(0));
			                
		                	  
		                	  if(arr.length==8) {
		                	  //if 32 byte exponent part should be 10 bits
		                		  exponent=""+arr[0].charAt(1)+arr[0].charAt(2)+arr[0].charAt(3)+arr[1].charAt(0)+arr[1].charAt(1)+arr[1].charAt(2)
		 		                		+arr[1].charAt(3)+arr[2].charAt(0)+arr[2].charAt(1)+arr[2].charAt(2);
		                		  
		                		 
		                		  
		                		  binary=Integer.parseInt(exponent,2);  
		                		  
		                		  
		                		  fraction=""+arr[2].charAt(3)+arr[3].charAt(0)+arr[3].charAt(1)+arr[3].charAt(2)+arr[3].charAt(3)+arr[4].charAt(0)+arr[4].charAt(1)+arr[4].charAt(2)+arr[4].charAt(3)+arr[5].charAt(0)+arr[5].charAt(1)+arr[5].charAt(2)+arr[5].charAt(3)+arr[6].charAt(0)+arr[6].charAt(1)+arr[6].charAt(2)+arr[6].charAt(3)+arr[7].charAt(0)+arr[7].charAt(1)+arr[7].charAt(2)+arr[7].charAt(3);
		                		 
		                		  if(arr[6].equals("1111")) {
		                			 
			                		  fraction=""+arr[2].charAt(3)+arr[3].charAt(0)+arr[3].charAt(1)+arr[3].charAt(2)+arr[3].charAt(3)+arr[4].charAt(0)+arr[4].charAt(1)+arr[4].charAt(2)+arr[4].charAt(3)+arr[5].charAt(0)+arr[5].charAt(1)+arr[5].charAt(2)+arr[5].charAt(3)+"1";
			                		  
			                		  
			                		  if(arr[2].endsWith("1") ){
		          		    				mantissa+=Math.pow(2, -1);
		          		    				
		          		    			}
		          		    			if(arr[3].equals("1000") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			 
		          		    			}if(arr[3].equals("1001") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    
		          		    			    mantissa+=Math.pow(2, -5);
		          		    			}if(arr[3].equals("1010") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    mantissa+=Math.pow(2, -4);
		          		    			}if(arr[3].equals("1011") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    mantissa+=Math.pow(2, -4);
		          		    			    mantissa+=Math.pow(2, -5);
		          		    			}if(arr[3].equals("1100") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    mantissa+=Math.pow(2, -3);

		          		    			}if(arr[3].equals("1101") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    mantissa+=Math.pow(2, -3);
		          		    			    mantissa+=Math.pow(2, -5);
		          		    			}if(arr[3].equals("1110") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    mantissa+=Math.pow(2, -3);
		          		    			    mantissa+=Math.pow(2, -4);
		          		    			}if(arr[3].equals("1111") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    mantissa+=Math.pow(2, -3);
		          		    			    mantissa+=Math.pow(2, -4);
		          		    			    mantissa+=Math.pow(2, -5);
		          		    			}
		          		    			
		          		    			    

		          		    			if(arr[3].equals("0001") ){
		          		    					
		          		    				    mantissa+=Math.pow(2, -5);

		          		    			}if(arr[3].equals("0010") ){
		          		    					
		          		    				    mantissa+=Math.pow(2, -4);
		          		    				}
		          		    			if(arr[3].equals("0011") ){
		          		    			    mantissa+=Math.pow(2, -4);

		          		    				mantissa+=Math.pow(2, -5);
		          		    				}
		          		    			if(arr[3].equals("0100") ){
		          		    				
		          		    			    mantissa+=Math.pow(2, -3);
		          		    			}
		          		    			if(arr[3].equals("0101") ){
		          		    			    mantissa+=Math.pow(2, -3);
		          		    			    mantissa+=Math.pow(2, -5);



		          		    			}if(arr[3].equals("0110") ){
		          		    				  mantissa+=Math.pow(2, -4);

		          		    				 mantissa+=Math.pow(2, -3);
		          		    			}

		          		    			if(arr[3].equals("0111") ){
		          		    				  mantissa+=Math.pow(2, -5);

		          		    				 mantissa+=Math.pow(2, -3);
		          		    			    mantissa+=Math.pow(2, -4);
		          		    			}

		          		    			if(arr[4].equals("1000") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			 
		          		    			}if(arr[4].equals("1001") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    
		          		    			    mantissa+=Math.pow(2, -5);
		          		    			}if(arr[4].equals("1010") ){
		          		    				mantissa+=Math.pow(2, -6);
		          		    			    mantissa+=Math.pow(2, -8);
		          		    			}if(arr[4].equals("1011") ){
		          		    				mantissa+=Math.pow(2, -6);
		          		    			    mantissa+=Math.pow(2, -8);
		          		    			    mantissa+=Math.pow(2, -9);
		          		    			}if(arr[4].equals("1100") ){
		          		    				mantissa+=Math.pow(2, -6);
		          		    			    mantissa+=Math.pow(2, -7);

		          		    			}if(arr[4].equals("1101") ){
		          		    				mantissa+=Math.pow(2, -6);
		          		    			    mantissa+=Math.pow(2, -7);
		          		    			    mantissa+=Math.pow(2, -9);
		          		    			}if(arr[4].equals("1110") ){
		          		    				mantissa+=Math.pow(2, -6);
		          		    			    mantissa+=Math.pow(2, -7);
		          		    			    mantissa+=Math.pow(2, -8);
		          		    			}if(arr[4].equals("1111") ){
		          		    				mantissa+=Math.pow(2, -6);
		          		    			    mantissa+=Math.pow(2, -7);
		          		    			    mantissa+=Math.pow(2, -8);
		          		    			    mantissa+=Math.pow(2, -9);
		          		    			}
		          		    			    

		          		    			if(arr[4].equals("0001") ){
		          		    					
		          		    				    mantissa+=Math.pow(2, -9);
		          		    			}if(arr[4].equals("0010") ){
		          		    					
		          		    				    mantissa+=Math.pow(2, -8);
		          		    				}
		          		    			if(arr[4].equals("0011") ){
		          		    			    mantissa+=Math.pow(2, -8);

		          		    				mantissa+=Math.pow(2, -9);
		          		    				}
		          		    			if(arr[4].equals("0100") ){
		          		    				
		          		    			    mantissa+=Math.pow(2, -7);
		          		    			}
		          		    			if(arr[4].equals("0101") ){
		          		    			    mantissa+=Math.pow(2, -7);

		          		    			    mantissa+=Math.pow(2, -9);
		          		    			}if(arr[4].equals("0110") ){
		          		    				  mantissa+=Math.pow(2, -7);

		          		    				 mantissa+=Math.pow(2, -8);
		          		    			}

		          		    			if(arr[4].equals("0111") ){
		          		    				  mantissa+=Math.pow(2, -7);

		          		    				  mantissa+=Math.pow(2, -8);
		          		    			     mantissa+=Math.pow(2, -9);

		          		    			}
		          		    			if(arr[5].equals("1000") ){
		          		    				mantissa+=Math.pow(2, -10);
		          		    			 
		          		    			}if(arr[5].equals("1001") ){
		          		    				mantissa+=Math.pow(2, -13);
		          		    			    
		          		    			    mantissa+=Math.pow(2, -10);
		          		    			}if(arr[5].equals("1010") ){
		          		    				mantissa+=Math.pow(2, -10);
		          		    			    mantissa+=Math.pow(2, -12);
		          		    			}if(arr[5].equals("1011") ){
		          		    				mantissa+=Math.pow(2, -10);
		          		    			    mantissa+=Math.pow(2, -12);
		          		    			    mantissa+=Math.pow(2, -13);
		          		    			}if(arr[5].equals("1100") ){
		          		    				mantissa+=Math.pow(2, -10);
		          		    			    mantissa+=Math.pow(2, -11);

		          		    			}if(arr[5].equals("1101") ){
		          		    				mantissa+=Math.pow(2, -10);
		          		    			    mantissa+=Math.pow(2, -11);
		          		    			    mantissa+=Math.pow(2, -13);
		          		    			}if(arr[5].equals("1110") ){
		          		    				mantissa+=Math.pow(2, -10);
		          		    			    mantissa+=Math.pow(2, -11);
		          		    			    mantissa+=Math.pow(2, -12);
		          		    			}if(arr[5].equals("1111") ){
		          		    				mantissa+=Math.pow(2, -10);
		          		    			    mantissa+=Math.pow(2, -11);
		          		    			    mantissa+=Math.pow(2, -12);
		          		    			    mantissa+=Math.pow(2, -13);
		          		    			}
		          		    			    

		          		    			if(arr[5].equals("0001") ){
		          		    					
		          		    				    mantissa+=Math.pow(2, -13);

		          		    			}if(arr[5].equals("0010") ){
		          		    					
		          		    				    mantissa+=Math.pow(2, -12);
		          		    				}
		          		    			if(arr[5].equals("0011") ){
		          		    			    mantissa+=Math.pow(2, -13);

		          		    				mantissa+=Math.pow(2, -12);
		          		    				}
		          		    			if(arr[5].equals("0100") ){
		          		    				
		          		    			    mantissa+=Math.pow(2, -11);
		          		    			}
		          		    			if(arr[5].equals("0101") ){
		          		    			    mantissa+=Math.pow(2, -11);
		          		    			    mantissa+=Math.pow(2, -13);



		          		    			}if(arr[5].equals("0110") ){
		          		    				  mantissa+=Math.pow(2, -10);

		          		    				 mantissa+=Math.pow(2, -11);
		          		    			}

		          		    			if(arr[5].equals("0111") ){
		          		    				  mantissa+=Math.pow(2, -11);

		          		    				 mantissa+=Math.pow(2, -12);
		          		    			    mantissa+=Math.pow(2, -13);
		          		    			}if(arr[5].equals("0000") ){
		          		    				
		          		    				if(arr[6].equals("1111")){
		          		    					 mantissa+=Math.pow(2, -13);
		          		    				}
	          		    				    
	   		          		    		 

	          		    			}
		          		    			    
		          		    	      mantissa+=mantissa+1;
		          		    	      System.out.println(mantissa);
		          		    	      double Bias=(Math.pow(2, exponent.length()-1)-1);
		          		    	      double sign_double=Double.parseDouble(sign);
		          		    	      double sign_pow=(Math.pow((-1), sign_double));
		          		    	      double h1=Math.pow(2, binary-Bias);
		          		    	      
		          		    	      double decimal_val=(sign_pow*mantissa*h1);
		          		    	      System.out.println(decimal_val);


			                		  break;
		                		  }
		                		  
		                		  
		                		  
		                		  
		                		  if(arr[6].equals("0000")) {
		                			  
		                			  fraction=""+arr[2].charAt(3)+arr[3].charAt(0)+arr[3].charAt(1)+arr[3].charAt(2)+arr[3].charAt(3)+arr[4].charAt(0)+arr[4].charAt(1)+arr[4].charAt(2)+arr[4].charAt(3)+arr[5].charAt(0)+arr[5].charAt(1)+arr[5].charAt(2)+arr[5].charAt(3);
		                			  
		                			  	char[]  a=new char[100];
		          		    			a=fraction.toCharArray();
		          		    			a.toString();
		          		    			if(arr[2].endsWith("1") ){
		          		    				mantissa+=Math.pow(2, -1);
		          		    				
		          		    			}
		          		    			if(arr[3].equals("1000") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			 
		          		    			}if(arr[3].equals("1001") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    
		          		    			    mantissa+=Math.pow(2, -5);
		          		    			}if(arr[3].equals("1010") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    mantissa+=Math.pow(2, -4);
		          		    			}if(arr[3].equals("1011") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    mantissa+=Math.pow(2, -4);
		          		    			    mantissa+=Math.pow(2, -5);
		          		    			}if(arr[3].equals("1100") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    mantissa+=Math.pow(2, -3);

		          		    			}if(arr[3].equals("1101") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    mantissa+=Math.pow(2, -3);
		          		    			    mantissa+=Math.pow(2, -5);
		          		    			}if(arr[3].equals("1110") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    mantissa+=Math.pow(2, -3);
		          		    			    mantissa+=Math.pow(2, -4);
		          		    			}if(arr[3].equals("1111") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    mantissa+=Math.pow(2, -3);
		          		    			    mantissa+=Math.pow(2, -4);
		          		    			    mantissa+=Math.pow(2, -5);
		          		    			}

		          		    			if(arr[3].equals("0001") ){
		          		    					
		          		    				    mantissa+=Math.pow(2, -5);
		   		          		    		 System.out.println(mantissa);

		          		    			}if(arr[3].equals("0010") ){
		          		    					
		          		    				    mantissa+=Math.pow(2, -4);
		          		    				}
		          		    			if(arr[3].equals("0011") ){
		          		    			    mantissa+=Math.pow(2, -4);

		          		    				mantissa+=Math.pow(2, -5);
		          		    				}
		          		    			if(arr[3].equals("0100") ){
		          		    				
		          		    			    mantissa+=Math.pow(2, -3);
		          		    			}
		          		    			if(arr[3].equals("0101") ){
		          		    			    mantissa+=Math.pow(2, -3);
		          		    			    mantissa+=Math.pow(2, -5);

				          		    		 System.out.println(mantissa);


		          		    			}if(arr[3].equals("0110") ){
		          		    				  mantissa+=Math.pow(2, -4);

		          		    				 mantissa+=Math.pow(2, -3);
		          		    			}

		          		    			if(arr[3].equals("0111") ){
		          		    				  mantissa+=Math.pow(2, -5);

		          		    				 mantissa+=Math.pow(2, -3);
		          		    			    mantissa+=Math.pow(2, -4);
		          		    			}

		          		    			if(arr[4].equals("1000") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			 
		          		    			}if(arr[4].equals("1001") ){
		          		    				mantissa+=Math.pow(2, -2);
		          		    			    
		          		    			    mantissa+=Math.pow(2, -5);
		          		    			}if(arr[4].equals("1010") ){
		          		    				mantissa+=Math.pow(2, -6);
		          		    			    mantissa+=Math.pow(2, -8);
		          		    			}if(arr[4].equals("1011") ){
		          		    				mantissa+=Math.pow(2, -6);
		          		    			    mantissa+=Math.pow(2, -8);
		          		    			    mantissa+=Math.pow(2, -9);
		          		    			}if(arr[4].equals("1100") ){
		          		    				mantissa+=Math.pow(2, -6);
		          		    			    mantissa+=Math.pow(2, -7);

		          		    			}if(arr[4].equals("1101") ){
		          		    				mantissa+=Math.pow(2, -6);
		          		    			    mantissa+=Math.pow(2, -7);
		          		    			    mantissa+=Math.pow(2, -9);
		          		    			}if(arr[4].equals("1110") ){
		          		    				mantissa+=Math.pow(2, -6);
		          		    			    mantissa+=Math.pow(2, -7);
		          		    			    mantissa+=Math.pow(2, -8);
		          		    			}if(arr[4].equals("1111") ){
		          		    				mantissa+=Math.pow(2, -6);
		          		    			    mantissa+=Math.pow(2, -7);
		          		    			    mantissa+=Math.pow(2, -8);
		          		    			    mantissa+=Math.pow(2, -9);
		          		    			}
		          		    			    

		          		    			if(arr[4].equals("0001") ){
		          		    					
		          		    				    mantissa+=Math.pow(2, -9);
		          		    			}if(arr[4].equals("0010") ){
		          		    					
		          		    				    mantissa+=Math.pow(2, -8);
		          		    				}
		          		    			if(arr[4].equals("0011") ){
		          		    			    mantissa+=Math.pow(2, -8);
		          		    			    mantissa+=Math.pow(2, -9);
		          		    				}
		          		    			if(arr[4].equals("0100") ){
		          		    				
		          		    			    mantissa+=Math.pow(2, -7);
		          		    			}
		          		    			if(arr[4].equals("0101") ){
		          		    			    mantissa+=Math.pow(2, -7);
		          		    			    mantissa+=Math.pow(2, -9);
		          		    			}if(arr[4].equals("0110") ){
		          		    				  mantissa+=Math.pow(2, -7);
		          		    				  mantissa+=Math.pow(2, -8);
		          		    			}

		          		    			if(arr[4].equals("0111") ){
		          		    				  mantissa+=Math.pow(2, -7);
		          		    				  mantissa+=Math.pow(2, -8);
		          		    			      mantissa+=Math.pow(2, -9);

		          		    			}
		          		    			if(mantissa==0) {
		    		          		    	System.out.println("Exact 0");

		          		    			}if(exponent=="255" & mantissa!=0) {
		          		    				
		          		    				System.out.println("not a number: NAN");
		          		    			}
		          		    			   
		                			 
			                		   
			                		    	 
			                		     
		                			  //calculate bias
			                		  double Bias=(Math.pow(2, exponent.length()-1)-1);
			                		  //convert integer sign to double
		          		    	      double sign_double=Double.parseDouble(sign);
		          		    	      double sign_pow=(Math.pow((-1), sign_double));
		          		    	      double h1=Math.pow(2, 1-Bias);
		          		    	      //final result
		          		    	      double decimal_val=(sign_pow*mantissa*h1);
		          		    	      break;
			                		  
			                	  }
		                  
		                		
		                	  else if(arr.length==6) {
		                		  
		                		  //for three byte
		                		  exponent=(""+arr[0].charAt(1)+arr[0].charAt(2)+arr[0].charAt(3)+arr[1].charAt(0)+arr[1].charAt(1)+arr[1].charAt(2));
		                		  binary=Integer.parseInt(exponent,2);  
		  		                		
		                		  break;
			                	  
		                	  }else if(arr.length==4) {
		                		  //for two byte
		                		  exponent=(""+arr[0].charAt(1)+arr[0].charAt(2)+arr[0].charAt(3)+arr[1].charAt(0)+arr[1].charAt(1)+arr[1].charAt(2));
		                		  binary=Integer.parseInt(exponent,2);  
		                				  break;
		                				  
		                	
			                	  
		                	  }else if(arr.length==2) {
		                		  //1 byte
		                		  
		                		  exponent=(""+ arr[0].charAt(1)+arr[0].charAt(2)+ arr[0].charAt(3)+arr[1].charAt(0));
		                		  fraction=""+arr[1].charAt(1)+arr[1].charAt(2)+arr[1].charAt(3);
		                		  binary=Integer.parseInt(exponent,2);  
		                		  
		                		  double Bias=(Math.pow(2, exponent.length()-1)-1);
	          		    	      double sign_double=Double.parseDouble(sign);
	          		    	      double sign_pow=(Math.pow((-1), sign_double));
	          		    	      double h1=Math.pow(2, 1-Bias);
	          		    	      double decimal_val=(sign_pow*mantissa*h1);
	          		    	     
		                		  
		                		  
			                	  
		                		 break;
		                		}
		                  
		            	HexToBin(hexdec);
					
				}
				else if(datatype.equalsIgnoreCase("U")) {
					
					
					char hexdec1[]=new char[100];
		    		hexdec1=s.toCharArray();
		    	     
		            try{
		            	
		               //take the binary value from the function
		               String str1 = HexToBin(hexdec1);
		               int binary1=0;
		            	 
						String[] arr1 = str1.split(" "); 
		            	  
		                String bintodec="";
		                bintodec=""+arr1[0].charAt(0)+arr1[0].charAt(1)+arr1[0].charAt(2)+arr1[0].charAt(3)+arr1[1].charAt(0)+arr1[1].charAt(1)+arr1[1].charAt(2)
 		                		+arr1[1].charAt(3)+arr1[2].charAt(0)+arr1[2].charAt(1)+arr1[2].charAt(2)+arr1[2].charAt(3)+arr1[3].charAt(0)+arr1[3].charAt(1)+arr1[3].charAt(2)+arr1[3].charAt(3);
                		 
		                
                		 if(arr1[0].startsWith("0")) {
                			 
                			 //if binary values sign is zero 
                			 binary1=Integer.parseInt(bintodec,2);  
                			 //converting the binary value to the decimal value
				        	 int bin_to_decimal=Integer.parseInt(bintodec,2);
				        	  System.out.println(binary1);
				      
		                }if(arr1[0].startsWith("1")) {
               			 //if binary values sign is one  

	                		  binary1=Integer.parseInt(bintodec,2);  
				        	 int bin_to_decimal=Integer.parseInt(bintodec,2);
				        	 System.out.println(binary1);
		                }
		                
                		 
                		 

		        	
		            }
		            catch (ArrayIndexOutOfBoundsException e){
		            	System.out.print("");

		            }
		 			
				
					
					
				}
               	
		                  }   
	
				
				}	
				
		 }	
				



    }
}
		
				 
			 
		 

	






    



        

		 
			 
		 

