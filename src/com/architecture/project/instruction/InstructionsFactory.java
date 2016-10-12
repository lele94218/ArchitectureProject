package com.architecture.project.instruction;

import com.architecture.project.utils.ProjectUtils;

/**
 * Instructions construct factory.
 *
 * @author taoranxue on 9/15/16 3:41 PM.
 */
public class InstructionsFactory {
    private static final int[] LOAD_STORE = {001, 002, 003, 041, 042};

    private Instruction instruction;


    /**
     * Construct factory class with instruction of the service class.
     *
     * @param instruction the instruction to be executed.
     */
    public InstructionsFactory(Instruction instruction) {
        this.instruction = instruction;
    }

    /**
     * Instantiate the particular instruction service class.
     *
     * @return instruction service class.
     */
    public Instructions getInstructions() {
        if (ProjectUtils.inArrays(this.instruction.getOperatorCode(), LOAD_STORE)) {
            System.out.println(this.instruction);
            return new LoadStoreInstructions(this.instruction);
        }
        // ... other instructions
        return null;
    }

    /**
     * Get instruction.
     *
     * @return instruction.
     */
    public Instruction getInstruction() {
        return instruction;
    }

    /**
     * Set instruction.
     *
     * @param instruction instruction.
     */
    public void setInstruction(Instruction instruction) {
        this.instruction = instruction;
    }

}
