package exceptions;

public class SemMatriculaException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public SemMatriculaException(String mensagem) {
		super(mensagem);
	}

}
