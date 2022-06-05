package Q2;

import java.util.Collections;

public interface Convertivel {

	<typeConvertido extends Collections, typeInicial> typeConvertido converter( typeInicial tI, typeConvertido tc);
}
