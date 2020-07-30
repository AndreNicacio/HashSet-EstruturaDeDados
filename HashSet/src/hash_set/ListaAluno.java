package hash_set;

import java.util.*;


public class ListaAluno {

	public static void main(String[] args) {
	    Set<Aluno> conjunto = new HashSet<Aluno>();

	    Aluno a = new Aluno("Nathan Ferreira", "OpenSource");
	    Aluno b = new Aluno("Antonio Sousa", "OpenOffice");
	    Aluno c = new Aluno("Lúcia Ferreira", "Pprogramação Web");
	    Aluno d = new Aluno("Nathan Ferreira", "OpenSource");
	    conjunto.add(a);
	    conjunto.add(b);
	    conjunto.add(c);
	    conjunto.add(d);
	    System.out.println(conjunto);

	}

}
