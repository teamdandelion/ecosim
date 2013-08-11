require 'rspec/core/rake_task'

RSpec::Core::RakeTask.new(:test)

task :default => :test

task :run do
  puts `bundle exec ruby main.rb`
end

