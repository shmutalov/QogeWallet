import React, { useContext } from 'react';
import Handoff from 'react-native-handoff';
import { BlueStorageContext } from '../blue_modules/storage-context';
import PropTypes from 'prop-types';

const HandoffComponent = props => {
  const { isHandOffUseEnabled } = useContext(BlueStorageContext);

  return isHandOffUseEnabled ? <Handoff {...props} /> : null;
};
export default HandoffComponent;

HandoffComponent.propTypes = {
  url: PropTypes.string,
};

HandoffComponent.activityTypes = {
  ReceiveOnchain: 'ml.gorynich.qogewallet.receiveonchain',
  Xpub: 'ml.gorynich.qogewallet.xpub',
  ViewInBlockExplorer: 'ml.gorynich.qogewallet.blockexplorer',
};
