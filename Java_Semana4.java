------Criar Array------

exemploArray = ["Toyota", "Audi", "Mercedes"];

Function CriarArray(){
	Alert(exemploArray);
}

------Acrescentar_um_item_ao_Array------

exemploArray2 = ["Azul", "Preto", "Branco"];

exemploArray2.Push("Vermelho");

Function AumentarArray(){
	Alert(exemploArray2);
}

------Eliminar_um_item_ao_Array------

exemploArray3 = ["Porto", "Sporting", "Benfica"];

exemploArray3.Pop();

Function EliminarArray(){
	Alert(exemploArray3);
}

------Acrescentar_um_item_no_inicio_do_Array------

exemploArray4 = ["Monitor", "Teclado", "Rato"];

exemploArray4.Unshift('Computador');

Function AdicionarNoInicio(){
	Alert(exemploArray4);
}

------Eliminar_um_item_no_inicio_do_Array------

exemploArray5 = ["Computador","Monitor", "Teclado", "Rato"];

exemploArray5.shift();

Function EliminarNoInicio(){
	Alert(exemploArray5);
}