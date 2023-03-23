import * as bitcoin from 'bitcoinjs-lib'

class QogecoinMainnet implements bitcoin.networks.Network {
  messagePrefix = '\x18Qogecoin Signed Message:\n';
  bech32 = 'bq';
  bip32 = {
    public: 0x03f6b840,
    private: 0x03f6b817,
  };
  pubKeyHash = 0x78;
  scriptHash = 0x66;
  wif = 0x5c;
};

const qogecoinMainnet = new QogecoinMainnet()
export default {
  mainnet: qogecoinMainnet,
  mainnetCoin: {
    network: qogecoinMainnet,
    coin: '0'
  }
}