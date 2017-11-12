
package mpm.core.command;

import mpm.core.command.ICommand;
import mpm.core.controle.IFachada;
import mpm.core.controle.Fachada;



public abstract class AbstractCommand implements ICommand {

	protected IFachada fachada = new Fachada();

}
