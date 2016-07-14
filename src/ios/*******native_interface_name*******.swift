import Foundation
import UIKit

@objc(*******3rd param in www interface function *******) class *******3rd param in www interface function ******* : CDVPlugin  {
    func *******4th param in www interface function ******* (command: CDVInvokedUrlCommand) {
        let params: AnyObject = command.arguments[0] as AnyObject!
        let user: String = params["user"] as AnyObject! as! String
        let apiKey: String = params["api"] as AnyObject! as! String
    }
}