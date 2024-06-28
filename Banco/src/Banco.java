import java.util.List;
import lombok.*;

@Data
public class Banco {

	private String nome;
	private List<Conta> contas;
}
