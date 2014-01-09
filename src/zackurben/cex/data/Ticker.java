/**
 * This project is licensed under the terms of the MIT license, you can read
 * more in LICENSE.txt; this project utilized the Google GSON library, licensed
 * under the Apache V2 License, which can be found at: gson/LICENSE.txt
 * 
 * Ticker.java
 * Version : 1.0.0
 * Author : Zack Urben
 * Contact : zackurben@gmail.com
 * Creation : 12/31/13
 * 
 * This is the Ticker data type, used to parse JSON to a Java Object.
 * 
 * Support:
 * Motivation BTC @ 1HvXfXRP9gZqHPkQUCPKmt5wKyXDMADhvQ
 * Cex.io Referral @ https://cex.io/r/0/kannibal3/0/
 * Cryptsy Trade Key @ e5447842f0b6605ad45ced133b4cdd5135a4838c
 * Other donations accepted via email request.
 */

package zackurben.cex.data;

public class Ticker {
	public long timestamp;
	public float low;
	public float high;
	public float last;
	public float volume;
	public float bid;
	public float ask;
}