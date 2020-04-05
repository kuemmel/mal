
step0:
	lein with-profile step-0-repl uberjar

step0_repl:
	lein with-profile step-0-repl uberjar

%: src/clj/%.clj
	lein with-profile % uberjar


#target/%.jar: src/clj/%.clj $(SRCS)
	#lein with-profile $(word 1,$(subst _, ,$*)) uberjar

clean:
	rm -rf target/
