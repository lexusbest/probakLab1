package lab1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IrakurriTest {
	private AktoreKatalogoa aktoreKat;
	private Irakurri i;

	@Before
	public void setUp() throws Exception {
		aktoreKat=AktoreKatalogoa.getNireAktoreKatalogoa();
	}

	@After
	public void tearDown() throws Exception {
		aktoreKat=null;
	}

	@Test
	public void testKargatu() {
		i = new Irakurri();
		try{
			i.kargatu("D:\\lanlekua\\DEA\\src\\lab1\\actors-small.txt");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		assertTrue(AktoreKatalogoa.getNireAktoreKatalogoa().AktoreaDago("﻿Kotsifakis, Hector"));//lehenengo aktorean 3 simbolo agertzen dira hasieran
		assertTrue(AktoreKatalogoa.getNireAktoreKatalogoa().AktoreaDago("Aaberge, Tone Damli"));
		assertTrue(AktoreKatalogoa.getNireAktoreKatalogoa().AktoreaDago("Holub, Carla"));
		assertTrue(PelikulaKatalogoa.getNirePelikulaKatalogoa().pelikulaDago("Me gusta cuando callas"));
		assertTrue(PelikulaKatalogoa.getNirePelikulaKatalogoa().pelikulaDago("Daniel & Ana"));
		assertTrue(PelikulaKatalogoa.getNirePelikulaKatalogoa().pelikulaDago("Seven Mummies"));
		aktoreKat.inprimatu(aktoreKat.taulaSortuOrdenatuGabe());
	}
	
	@Test
	public void testAktoreFitxSortu(){
		i = new Irakurri();
		try{
			i.kargatu("D:\\lanlekua\\DEA\\src\\lab1\\actors-small.txt");
			Irakurri.aktoreFitxSortu(aktoreKat.AktoreenIzenenLista());
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
