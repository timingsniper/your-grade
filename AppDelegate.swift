//
//  AppDelegate.swift
//  Kiminograde
//
//  Created by 장준우 on 2017. 3. 17..
//  Copyright © 2017년 Joonwoo Percy Jang. All rights reserved.
//

import Cocoa

@NSApplicationMain
class AppDelegate: NSObject, NSApplicationDelegate {

    @IBOutlet weak var window: NSWindow!

    @IBOutlet weak var cat1: NSTextField!
    @IBOutlet weak var cat2: NSTextField!
    @IBOutlet weak var cat3: NSTextField!
    @IBOutlet weak var cat4: NSTextField!
    @IBOutlet weak var cat5: NSTextField!
    
    @IBOutlet weak var g1: NSTextField!
    @IBOutlet weak var g2: NSTextField!
    @IBOutlet weak var g3: NSTextField!
    @IBOutlet weak var g4: NSTextField!
    @IBOutlet weak var g5: NSTextField!
    
    @IBOutlet weak var r1: NSTextField!
    @IBOutlet weak var r2: NSTextField!
    @IBOutlet weak var r3: NSTextField!
    @IBOutlet weak var r4: NSTextField!
    @IBOutlet weak var r5: NSTextField!
    @IBOutlet weak var r6: NSTextField!
    @IBOutlet weak var r7: NSTextField!
    @IBOutlet weak var r8: NSTextField!
    @IBOutlet weak var r9: NSTextField!
    @IBOutlet weak var r10: NSTextField!
    @IBOutlet weak var r11: NSTextField!
    @IBOutlet weak var r12: NSTextField!
    @IBOutlet weak var r13: NSTextField!
    
    
    @IBOutlet weak var errorL: NSTextField!
    
    @IBOutlet weak var calcButt: NSButton!
    
    func magic(wantGrade : Double) -> Double{
        //var divN : Double = 5
        var noF : Bool = false
        var current : Double = 0
        var shouldGet : Double = 0
        
        /* Category weightage input*/
        var cv1t: String = cat1.stringValue
        var cv1: Double = (cv1t as NSString).doubleValue

        var cv2t: String = cat2.stringValue
        var cv2: Double = (cv2t as NSString).doubleValue
        
        var cv3t: String = cat3.stringValue
        var cv3: Double = (cv3t as NSString).doubleValue
        
        var cv4t: String = cat4.stringValue
        var cv4: Double = (cv4t as NSString).doubleValue
        
        var cv5t: String = cat5.stringValue
        var cv5: Double = (cv5t as NSString).doubleValue
        
        if(cv5t.isEmpty){
            noF = true
        }
        
        if(cv1+cv2+cv3+cv4+cv5 != 80){
            self.errorL.stringValue = "Make sure Weightage adds up to 80!"
            return 0
        }
        
        /* Category grade input*/
        var cd1t: String = g1.stringValue
        var cvg1: Double = (cd1t as NSString).doubleValue
        
        var cd2t: String = g2.stringValue
        var cvg2: Double = (cd2t as NSString).doubleValue
        
        var cd3t: String = g3.stringValue
        var cvg3: Double = (cd3t as NSString).doubleValue
        
        var cd4t: String = g4.stringValue
        var cvg4: Double = (cd4t as NSString).doubleValue
        
        var cd5t: String = g5.stringValue
        var cvg5: Double = (cd5t as NSString).doubleValue
        
       if(noF){
            current = ((cv1)*(cvg1/100))+((cv2)*(cvg2/100))+((cv3)*(cvg3/100))+((cv4)*(cvg4/100))
       

        }
            
       else{
            current = ((cv1)*(cvg1/100))+((cv2)*(cvg2/100))+((cv3)*(cvg3/100))+((cv4)*(cvg4/100))+((cv5)*(cvg5/100))
        }
        
        self.errorL.stringValue = " "
        
        //shouldGet = (wantGrade-current)*5
        
        
        return (wantGrade-current)*5
        
     
        
        
    }
    
    
    @IBAction func buttPressed(_ sender: Any) {
        
        var final1 : Double = magic(wantGrade: 96.5)
        var final2 : Double = magic(wantGrade: 92.5)
        var final3 : Double = magic(wantGrade: 89.5)
        var final4 : Double = magic(wantGrade: 86.5)
        var final5 : Double = magic(wantGrade: 82.5)
        var final6 : Double = magic(wantGrade: 79.5)
        var final7 : Double = magic(wantGrade: 76.5)
        var final8 : Double = magic(wantGrade: 72.5)
        var final9 : Double = magic(wantGrade: 69.5)
        var final10 : Double = magic(wantGrade: 66.5)
        var final11 : Double = magic(wantGrade: 62.5)
        var final12 : Double = magic(wantGrade: 59.5)
        var final13 : Double = magic(wantGrade: 52.5)
        
        if(final1>100 || final1<0){
            self.r1.stringValue = "N/A"
        }
        else{
            self.r1.stringValue = String(format: "%.2f", final1)
        }
    
        if(final2>100 || final2<0){
            self.r2.stringValue = "N/A"
        }
        else{
            self.r2.stringValue = String(format: "%.2f", final2)
        }
        
        if(final3>100 || final3<0){
            self.r3.stringValue = "N/A"
        }
        else{
            self.r3.stringValue = String(format: "%.2f", final3)
        }
        
        if(final4>100 || final4<0){
            self.r4.stringValue = "N/A"
        }
        else{
            self.r4.stringValue = String(format: "%.2f", final4)
        }
        
        if(final5>100 || final5<0){
            self.r5.stringValue = "N/A"
        }
        else{
            self.r5.stringValue = String(format: "%.2f", final5)
        }
        
        if(final6>100 || final6<0){
            self.r6.stringValue = "N/A"
        }
        else{
            self.r6.stringValue = String(format: "%.2f", final6)
        }
        
        if(final7>100 || final7<0){
            self.r7.stringValue = "N/A"
        }
        else{
            self.r7.stringValue = String(format: "%.2f", final7)
        }
        
        if(final8>100 || final8<0){
            self.r8.stringValue = "N/A"
        }
        else{
            self.r8.stringValue = String(format: "%.2f", final8)
        }
        
        if(final9>100 || final9<0){
            self.r9.stringValue = "N/A"
        }
        else{
            self.r9.stringValue = String(format: "%.2f", final9)
        }
        
        if(final10>100 || final10<0){
            self.r10.stringValue = "N/A"
        }
        else{
            self.r10.stringValue = String(format: "%.2f", final10)
        }

        if(final11>100 || final11<0){
            self.r11.stringValue = "N/A"
        }
        else{
            self.r11.stringValue = String(format: "%.2f", final11)
        }
        
        if(final12>100 || final12<0){
            self.r12.stringValue = "N/A"
        }
        else{
            self.r12.stringValue = String(format: "%.2f", final12)
        }
        
        if(final13>100 || final13<0){
            self.r13.stringValue = "N/A"
        }
        else{
            self.r13.stringValue = String(format: "%.2f", final13)
        }











   
        
        
        /*self.r1.stringValue = String(format: "%.2f", magic(wantGrade: 96.5))
        self.r2.stringValue = String(format: "%.2f", magic(wantGrade: 92.5))
        self.r3.stringValue = String(format: "%.2f", magic(wantGrade: 89.5))
        
        self.r4.stringValue = String(format: "%.2f", magic(wantGrade: 86.5))
        self.r5.stringValue = String(format: "%.2f", magic(wantGrade: 82.5))
        self.r6.stringValue = String(format: "%.2f", magic(wantGrade: 79.5))
        
        self.r7.stringValue = String(format: "%.2f", magic(wantGrade: 76.5))
        self.r8.stringValue = String(format: "%.2f", magic(wantGrade: 72.5))
        self.r9.stringValue = String(format: "%.2f", magic(wantGrade: 69.5))
        
        self.r10.stringValue = String(format: "%.2f", magic(wantGrade: 66.5))
        self.r11.stringValue = String(format: "%.2f", magic(wantGrade: 62.5))
        self.r12.stringValue = String(format: "%.2f", magic(wantGrade: 59.5))
        
        self.r13.stringValue = String(format: "%.2f", magic(wantGrade: 52.5))*/
    }
    
    
    
    
    
    
    func applicationDidFinishLaunching(_ aNotification: Notification) {
        // Insert code here to initialize your application
    }

    func applicationWillTerminate(_ aNotification: Notification) {
        // Insert code here to tear down your application
    }


    

}

