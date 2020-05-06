package com.java.peformance;

class FindingNemo {
	  public static void main(String[] args) {
	    String[] nemo = {"nemo"};
	    findNemo(nemo);
	  }

	  public static void findNemo(String[] nemo){
	    for(int i=0 ; i< nemo.length;i++){
	      if (nemo[i]=="nemo")
	      System.out.println("Found Nemo!");
	    }
	  }
	}
