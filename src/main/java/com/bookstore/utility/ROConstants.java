package com.bookstore.utility;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ROConstants {
	public final static String RO = "RO";
	
	public final static Map<String, String> mapOfROCounty = new HashMap<String, String>(){
		{
			put("AB", "Alba");
			put("AR", "Arad");
			put("AG", "Arges");
			put("BC", "Bacau");
			put("BH", "Bihor");
			put("BN", "Bistrita-Nasaud");
			put("BT", "Botosani");
			put("BV", "Brasov");
			put("BR", "Braila");
			put("B", "Bucuresti");
			put("BZ", "Buzau");
			put("CS", "Caras-Severin");
			put("CL", "Calarasi");
			put("CJ", "Cluj");
			put("CT", "Constanta");
			put("CV", "Covasna");
			put("DB", "Dambovita");
			put("DJ", "Dolj");
			put("GL", "Galati");
			put("GR", "Giurgiu");
			put("GJ", "Gorj");
			put("HR", "Harghita");
			put("HD", "Hunedoara");
			put("IL", "Ialomita");
			put("IS", "Iasi");
			put("IF", "Ilfov");
			put("MM", "Maramures");
			put("MH", "Mehedinti");
			put("MS", "Mures");
			put("NT", "Neamt");
			put("OT", "Olt");
			put("PH", "Prahova");
			put("SM", "SatuMare");
			put("SJ", "Salaj");
			put("SB", "Sibiu");
			put("SV", "Suceava");
			put("TR", "Teleorman");
			put("TM", "Timis");
			put("TL", "Tulcea");
			put("VS", "Vaslui");
			put("VL", "Valcea");
			put("VN", "Vrancea");
		}
	};
	
	public final static List<String> listOfROCountyCode = new ArrayList<>(mapOfROCounty.keySet());
	public final static List<String> listOfROCountyName = new ArrayList<>(mapOfROCounty.values());

}
