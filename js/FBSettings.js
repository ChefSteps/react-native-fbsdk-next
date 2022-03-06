'use strict';

import {isDefined, isString} from './util/validate';

const Settings = require('react-native').NativeModules.FBSettings;

module.exports = {
  /**
   * Initialize the sdk
   */
  initializeSDK() {
    Settings.initializeSDK();
  },
  /**
   * Set app id
   */
  setAppID(appID) {
    if (!isDefined(appID) || !isString(appID) || appID.length === 0) {
      throw new Error("setAppID expected 'appID' to be a non empty string");
    }
    Settings.setAppID(appID);
  },
};
