package box;

public class Qtable {

    /**
     Q table where each row is a state and each column is an action [NSEW]

     state_1[action1,action2, action3,..., action_n],
     state_2[action1,action2, action3,..., action_n],
     .
     state_m[action1,action2, action3,..., action_n]
     **/
    private double[][] qTable;
    private int numActions;
    private int numStates;

    Qtable(int _numStates, int _numActions){
        numStates = _numStates;
        numActions = _numActions;

        initQTable();
    }

    /**
     * Initialises qTable to a numStates x numActions array of 0.0
     */
    private void initQTable(){
        qTable = new double[numStates][numActions];
        for(int i = 0; i < numStates; i++){
            for(int j = 0; j < numActions; j++)
                qTable[i][j] = 0.0;
        }
    }


    /**
     * Finds the best action (i.e the action of a state with the highest value)
     * and returns its action number
     * @param stateNumber the index of the state whos actions should be searched
     * @return integer index of qtable of the best action
     */
    private int getBestAction(int stateNumber){
        int bestAction = 0;
        double bestActionValue = 0.0;

        for(int i = 0; i < numActions; i++){
            if(qTable[stateNumber][i] > bestActionValue){
                bestActionValue = qTable[stateNumber][i];
                bestAction = i;
            }
        }
        return bestAction;
    }


}
