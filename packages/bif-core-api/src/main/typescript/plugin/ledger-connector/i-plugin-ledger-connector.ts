
/**
 * Common interface to be implemented by plugins which are implementing the connection to ledgers.
 */
export interface IPluginLedgerConnector<T,K> {

    /**
     * Deploys the BIF build-in smart contract written for this ledger to manage the validator's public keys.
     */
    deployContract(options?: T): Promise<K>;

    /**
     * Adds the public key to the ledger state.
     *
     * @param publicKeyHex The HEX representation of a public key of a BIF node.
     */
    addPublicKey(publicKeyHex: string): Promise<void>;
}