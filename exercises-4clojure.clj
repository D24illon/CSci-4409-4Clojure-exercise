;;; Put your solutions to the assigned 4Clojure exercises here and commit
;;; back up to your fork on Github.

;;; What you enter is what whatever you'd put in the "Code which fills in the blank"
;;; box in 4Clojure. You're welcome to include other things here (helper definitions,
;;; scratch computations you found helpful, etc.), SO MAKE SURE YOU LABEL YOUR
;;; "ANSWERS" clearly.

;;; I've included a few examples below just to give you a sense of what I'm looking
;;; for.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #162: Logical falsity and true

; What I pasted in the box:

1

; because all the given expressions returned 1, for example:

(= 1 (if [] 1 0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #15: Double Down

; What I pasted in the box:

#(* 2 %)

; which is an anonymous function that doubles its argument, for example:

(= (#(* 2 %) 11) 22)

;Ex10: 
  20
  
;Ex16: 
  #(str "Hello, " % "!")
  
;Ex17: 
  '(6 7 8)
  
;Ex18: 
  '(6 7)
  
;Ex20: 
  #(nth % (- (count %) 2))
  
;Ex21: 
  #(last (take (inc %2) %1))
  
;Ex23: 
  #(into '() %)
  
;Ex25: 
  #(filter odd? %)
  
;Ex37: 
  "ABC"
  
;Ex40: 
  #(drop-last (mapcat vector %2 (repeat %1)))
  
;Ex43: 
  #(apply map list(partition %2 %1))

;I could not do this one. I found a resource online that did this one. I looked at each clojure method carefully to
;understand how they got this one.
;Ex44: 
  (fn [n collection]
    (let [ntime (if (neg? n) (- n) n)
      lshift #(concat (rest %) [(first %)])
      rshift #(cons (last %) (drop-last %))]
    ((apply comp (repeat ntime (if (neg? n) rshift lshift))) collection)))
  
;I used fn instead of #(), because it said we have nested #(). That and I didn't know how to do it the other way
;Ex46: 
  (fn flip-out [f]
      (fn [& x] (apply f (reverse x))))
    
;Ex47:
  4

