/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Peter
 */


    public interface Command {

        public void execute()throws Exception;
        public void undo();
        public void redo();
    }

