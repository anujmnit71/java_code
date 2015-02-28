        
        import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
        // Other imports go here
          
        // Do NOT change the class name
        class MySolution {
            public static void main(String[] args) throws IOException {
            	File f = new File("src/ip.txt");
        		FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);

                int test = Integer.parseInt(br.readLine());
                while(test-- > 0){
                    Stack<Float> s = new Stack<Float>();
                    String str = br.readLine();
                    for(int i=0 ; i< str.length() ; i++){
                        char symb = str.charAt(i);
                        if(symb == '+' ||
                        symb == '-' ||
                        symb == '*' ||
                        symb == '/' ){
                            Float op2 = s.pop();
                            Float op1 = s.pop();
                            switch(symb){
                                case '+':
                                        s.push(op1 + op2);
                                        break;
                                 case '-':
                                        s.push(op1 - op2);
                                        break;
                                 case '*':
                                        s.push(op1 * op2);
                                        break;
                                 case '/':
                                        s.push(op1/op2);
                                        break;
                                        
                            }
                        }
                        else{
                            s.push((float) (symb  - '0'));
                        }
                    }
                    float ans = s.pop();
                    DecimalFormat newFormat = new DecimalFormat("#.######");
                    double res =  Double.valueOf(newFormat.format(ans));
                    System.out.println(res);
                    
                }
                // Write your code here
            }
        }
