package org.StringExamples.com;

public class RmDuplicateCharacters {
	
	public static void main(String[] args) {
		 
		String str = "HelloVishali";
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		int count;
		for(int i =0; i<ch.length; i++) {
			count =1;
			for(int j=i+1; j<ch.length; j++) {
				
				if(ch[i] == ch[j]) {
					
					count++;
					ch[j]='0';
				}	
			}
			if(count>1 && ch[i]!='0') {
				System.out.println("Duplicates elements in a given string are " + ch[i]);
			}
		}
	    System.out.print("After removing the deuplicate elements in given string: ");
		for(int i =0; i<ch.length; i++) {
			if(ch[i]!='0') {
				System.out.print(ch[i]);
			}
		}
		
	
		}
	}


