/**
 * 
 */
package com.samir.app;

import java.util.Arrays;

/**
 * @author Samir Deshmukh
 *
 */
public class Search {
	public static void main(String[] args) {
		int a[]={1,6,334,56,23,12};
		System.out.println(Arrays.toString(a)+" Find:"+56+" Result Index:"+linearSearch(a, 56));
		int b[]={10,20,30,35,40,50,60};
		System.out.println(Arrays.toString(b)+" Find:"+35+" Result Index:"+binarySearch(b, 35));
		
	}
	
	public static int linearSearch(int[] arr,int number){
		for(int index=0;index<arr.length;index++){
			if(arr[index]==number){
				return index;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr,int number){
		int lowerIndex=0;
		int upperIndex=arr.length;
		while(lowerIndex<=upperIndex){
			int mid=lowerIndex+(upperIndex-lowerIndex)/2;
			if(arr[mid]==number){
				return mid;
			}else if(arr[mid]>number){
				lowerIndex=mid+1;
			}else{
				upperIndex=mid-1;
			}
		}
		return -1;
	}

}
