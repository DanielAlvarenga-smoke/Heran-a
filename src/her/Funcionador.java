package her;

import java.util.ArrayList;

public class Funcionador {

	public static void main(String[] args) {
		
		Caminhao caminhao=new Caminhao(null, 0, 0);
		Onibus onibus=new Onibus(null, 0, 0);
		ArrayList<String> ar=new ArrayList<String>();
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		ArrayList<Integer> ar3=new ArrayList<Integer>();
		ArrayList<Object> exibe=new ArrayList<Object>();
		
		onibus.setPlaca("QWE-2348");
		ar.add(onibus.getPlaca());
		onibus.setAno(2020);
		ar1.add(onibus.getAno());
		onibus.setAssentos(40);
		ar1.add(onibus.getAssentos());
		onibus.exibirDados(null, 0);
		
		onibus.setPlaca("RTY-5345");
		ar.add(onibus.getPlaca());
		onibus.setAno(2010);
		ar1.add(onibus.getAno());
		onibus.setAssentos(50);
		ar2.add(onibus.getAssentos());
		onibus.exibirDados(null, 0);
		
		onibus.setPlaca("UIO-2378");
		ar.add(onibus.getPlaca());
		onibus.setAno(2000);
		ar1.add(onibus.getAno());
		onibus.setAssentos(60);
		ar2.add(onibus.getAssentos());
		onibus.exibirDados(null, 0);
		
		onibus.setPlaca("PAS-5019");
		ar.add(onibus.getPlaca());
		onibus.setAno(1990);
		ar1.add(onibus.getAno());
		onibus.setAssentos(70);
		ar2.add(onibus.getAssentos());
		onibus.exibirDados(null, 0);
		
		onibus.setPlaca("DFG-0192");
		ar.add(onibus.getPlaca());
		onibus.setAno(1980);
		ar1.add(onibus.getAno());
		onibus.setAssentos(80);
		ar2.add(onibus.getAssentos());
		onibus.exibirDados(null, 0);
		
		caminhao.setPlaca("TRE-0099");
		ar.add(caminhao.getPlaca());
		caminhao.setAno(2017);
		ar1.add(caminhao.getAno());
		caminhao.setEixos(4);
		ar3.add(caminhao.getEixos());
		caminhao.exibirDados(null, 0);
		
		caminhao.setPlaca("HJK-8632");
		ar.add(caminhao.getPlaca());
		caminhao.setAno(2015);
		ar1.add(caminhao.getAno());
		caminhao.setEixos(6);
		ar3.add(caminhao.getEixos());
		caminhao.exibirDados(null, 0);
		
		caminhao.setPlaca("LZX-7044");
		ar.add(caminhao.getPlaca());
		caminhao.setAno(2005);
		ar1.add(caminhao.getAno());
		caminhao.setEixos(8);
		ar3.add(caminhao.getEixos());
		caminhao.exibirDados(null, 0);
		
		caminhao.setPlaca("CVB-1209");
		ar.add(caminhao.getPlaca());
		caminhao.setAno(1995);
		ar1.add(caminhao.getAno());
		caminhao.setEixos(10);
		ar3.add(caminhao.getEixos());
		caminhao.exibirDados(null, 0);
		
		caminhao.setPlaca("NMB-9843");
		ar.add(caminhao.getPlaca());
		caminhao.setAno(1985);
		ar1.add(caminhao.getAno());
		caminhao.setEixos(12);
		ar3.add(caminhao.getEixos());
		caminhao.exibirDados(null, 0);
		
		for( Object console : exibe) {
			System.out.println(exibe);
		}
		
	}

}
