#import "RCTFBSDKSettings.h"

#import <React/RCTConvert.h>

@implementation RCTFBSDKSettings

RCT_EXPORT_MODULE(FBSettings);

RCT_EXPORT_METHOD(initializeSDK)
{
  [FBSDKApplicationDelegate initializeSDK:nil];
}

RCT_EXPORT_METHOD(setAppID:(NSString *)appID)
{
  [FBSDKSettings setAppID:appID];
}

@end
